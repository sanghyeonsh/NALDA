package com.a204.nalda.config;


import com.a204.nalda.config.jwt.JwtAuthenticationFilter;
import com.a204.nalda.config.jwt.JwtAuthorizationFilter;
import com.a204.nalda.repository.flight.SeatRepository;
import com.a204.nalda.repository.user.UserRepository;
import com.a204.nalda.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.web.filter.CorsFilter;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final CorsFilter corsFilter;
    private final UserRepository userRepository;
    private final UserService userService;
    private final SeatRepository seatRepository;
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .addFilter(corsFilter)
                .formLogin().disable()
                .httpBasic().disable()
                .addFilter(new JwtAuthenticationFilter(authenticationManager(), userService,seatRepository))
                .addFilter(new JwtAuthorizationFilter(authenticationManager(),userRepository))
                .authorizeRequests()
                .antMatchers(HttpMethod.OPTIONS,"/**/*").permitAll()
                .antMatchers("/user/userDetail/**")
                .access("hasRole('ROLE_USER') or hasRole('ROLE_STEWARDESS')")
                .anyRequest().permitAll();
    }
}
