//package com.a204.nalda.config.jwt;
//
//import com.a204.nalda.config.auth.PrincipalDetails;
//import com.a204.nalda.config.auth.PrincipalDetailsService;
//import com.a204.nalda.domain.entity.User;
//import com.a204.nalda.repository.UserRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.authentication.BadCredentialsException;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.stereotype.Component;
//
//@Component
//@RequiredArgsConstructor
//public class AuthenticationProviderImpl implements AuthenticationProvider {
//
//    private final PrincipalDetailsService principalDetailsService;
//    private final BCryptPasswordEncoder bCryptPasswordEncoder;
//
//    @Override
//    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
//        System.out.println("authenticate 호출");
//        UsernamePasswordAuthenticationToken token = (UsernamePasswordAuthenticationToken) authentication;
//
//        String username = token.getName();
//        String password = (String) token.getCredentials();
//
//        PrincipalDetails user = (PrincipalDetails) principalDetailsService.loadUserByUsername(username);
//
//        if(user == null) {
//            throw new BadCredentialsException(user.getUsername() + "Invalid id");
//        }
//
//        if(!bCryptPasswordEncoder.matches(password, user.getPassword())) {
//            throw new BadCredentialsException(user.getUsername() + "Invalid password");
//        }
//
//        return new UsernamePasswordAuthenticationToken(user.getUser(),"",user.getAuthorities());
//    }
//
//    @Override
//    public boolean supports(Class<?> authentication) {
//        return authentication.equals(UsernamePasswordAuthenticationToken.class);
//    }
//}
