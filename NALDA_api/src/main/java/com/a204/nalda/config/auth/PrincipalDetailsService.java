package com.a204.nalda.config.auth;

import com.a204.nalda.domain.entity.User;
import com.a204.nalda.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PrincipalDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("PricipalDetailsService 의 loadUserByUsername");
        User userEntity= userRepository.findUserByUsername(username);
        return new PrincipalDetails(userEntity);
    }
}
