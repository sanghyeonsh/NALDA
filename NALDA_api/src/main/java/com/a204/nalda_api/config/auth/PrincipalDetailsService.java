package com.a204.nalda_api.config.auth;

import com.a204.nalda_api.domain.entity.User;
import com.a204.nalda_api.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PrincipalDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("PricipalDetailsService 의 loadUserByUsername");
        User userEntity= userRepository.findByUsername(username);
        return new PrincipalDetails(userEntity);
    }
}
