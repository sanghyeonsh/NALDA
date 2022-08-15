package com.a204.nalda.config.jwt;

import com.a204.nalda.config.auth.PrincipalDetails;
import com.a204.nalda.domain.entity.airplane.Airplane;
import com.a204.nalda.domain.entity.airplane.Seat;
import com.a204.nalda.domain.entity.user.User;
import com.a204.nalda.dto.seatDTO.SeatDTO;
import com.a204.nalda.repository.SeatRepository;
import com.a204.nalda.service.UserService;
import com.auth0.jwt.algorithms.Algorithm;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

@RequiredArgsConstructor
public class JwtAuthenticationFilter extends UsernamePasswordAuthenticationFilter {

    private final AuthenticationManager authenticationManager;
    private final UserService userService;
    private final SeatRepository seatRepository;



    // /login 요청을 하면 로그인 시도를 위해서 실행되는 함수
    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
        System.out.println("JwtAuthenticationFilter 로그인 시도중");

        try {
            ObjectMapper om = new ObjectMapper();
            User user = om.readValue(request.getInputStream(), User.class);
            System.out.println(userService.idUsed(user.getUsername()));
            if(!userService.idUsed(user.getUsername())) {
                response.setStatus(HttpStatus.UNAUTHORIZED.value());
                response.setContentType(MediaType.APPLICATION_JSON_VALUE);

                Map<String,Object> body = new LinkedHashMap<>();
                body.put("msg", "로그인 실패");

                new ObjectMapper().writeValue(response.getOutputStream(),body);
            }

            UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword());

            //PrincipalDetailsService의 loadUserByUsername() 함수가 실행된 후 정상이면 authentication이 리턴됨.
            //DB에 있는 username과 password가 일치한다.
            Authentication authentication = authenticationManager.authenticate(authenticationToken);

            PrincipalDetails principalDetails = (PrincipalDetails) authentication.getPrincipal();
            System.out.println(principalDetails.getUser().getUsername());
            // authentication 객체가 session 영역에 저장을 해야하고 그 방법이 return 해주면 .
            // 리턴의 이유는 권한 관리를 security가 대신 해주기 때문에 편하려고 하는거임.
            // 굳이 JWT 토큰을 사용하면서 세션을 만들 이유가 없음. 근데 단지 권한 처리 때문에 session 넣어줍니다.

            return authentication;
        } catch (Exception e) {
            //데이터를 클라이언트쪽으로 실패메세지를 보낸다.
            e.printStackTrace();
            return null;
        }
    }

    // attemptAuthentication 실행 후 인증이 정상적으로 되었으면 successfulAuthentication 함수가 실행되요.
    // JWT 토큰을 만들어서 request 요청한 사용자에게 JWT 토큰을 response 해주면 됨
    @Override
    @Transactional
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authResult) throws IOException, ServletException {
        System.out.println("successfulAuthentication 실행됨 : 인증이 완료되었다는 뜻임");
        PrincipalDetails principalDetails = (PrincipalDetails) authResult.getPrincipal();

        //RSA 방식은 아니고 Hash암호 방식
        String jwtToken = com.auth0.jwt.JWT.create()
                .withSubject("NALDA토큰")
                .withExpiresAt(new Date(System.currentTimeMillis() + (6000000*10)))
                .withClaim("id", principalDetails.getUser().getId())
                .withClaim("username", principalDetails.getUser().getUsername())
                .sign(Algorithm.HMAC512("NALDA_with"));

        response.addHeader("Authorization", "Bearer " + jwtToken);
        System.out.println("RemoteHost : " + request.getRemotePort());
        String ip = request.getHeader("X-Forwarded-For");
//        System.out.println("X-Forwarded-For : " +ip);
        if (ip == null) {

            ip = request.getHeader("Proxy-Client-IP");
//            System.out.println("Proxy-Client-IP : " + ip);
        }
        if (ip == null) {
            ip = request.getHeader("WL-Proxy-Client-IP");
//            System.out.println("WL-Proxy-Client-IP : " + ip);
        }
        if (ip == null) {
            ip = request.getHeader("HTTP_CLIENT_IP");
//            System.out.println("HTTP_CLIENT_IP : " + ip);
        }
        if (ip == null) {
            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
//            System.out.println("HTTP_X_FORWARDED_FOR : " + ip);
        }
        if (ip == null) {
            ip = request.getRemoteAddr();
//            System.out.println("RemoteAddr() : " + ip);
        }
        System.out.println(ip);
        Optional<Seat> seat = seatRepository.findByIp(ip);
        SeatDTO seatDTO = SeatDTO.builder()
                .airplaneKind(seat.orElse(null).getAirplane().getAirplaneKind())
                .seatNum(seat.orElse(null).getSeatNum())
                .seatClass(seat.orElse(null).getSeatClass())
                .build();


        //인증 성공 메세지를 클라이언트로보낸다..
        Map<String,Object> body = new LinkedHashMap<>();
        body.put("msg", "로그인 성공");
        body.put("userInfo", userService.loginUser(principalDetails.getUser().getUsername()));
        body.put("seatInfo", seatDTO);
        response.setStatus(HttpStatus.OK.value());
        response.setContentType(MediaType.APPLICATION_JSON_VALUE);

        new ObjectMapper().registerModule(new JavaTimeModule()).writeValue(response.getOutputStream(),body);
        }

    @Override
    protected void unsuccessfulAuthentication(HttpServletRequest request, HttpServletResponse response, AuthenticationException failed) throws IOException, ServletException {
        response.setStatus(HttpStatus.UNAUTHORIZED.value());
        response.setContentType(MediaType.APPLICATION_JSON_VALUE);

        Map<String,Object> body = new LinkedHashMap<>();
        body.put("msg", "로그인 실패");

        new ObjectMapper().writeValue(response.getOutputStream(),body);
    }


}
