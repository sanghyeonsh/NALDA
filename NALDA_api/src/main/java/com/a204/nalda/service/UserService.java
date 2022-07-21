package com.a204.nalda.service;

import com.a204.nalda.domain.embedded.Address;
import com.a204.nalda.domain.embedded.FullName;
import com.a204.nalda.domain.entity.Terms;
import com.a204.nalda.domain.entity.User;
import com.a204.nalda.domain.entity.UserDetail;
import com.a204.nalda.dto.JoinDto;
import com.a204.nalda.dto.LoginDto;
import com.a204.nalda.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public void JoinUser(JoinDto joinDto) {
        System.out.println("회원가입 서비스 호출");
        FullName fullName = FullName.builder()
                .firstName(joinDto.getFirstName())
                .middleName(joinDto.getMiddleName())
                .lastName(joinDto.getLastName())
                .build();

        Terms terms = Terms.builder()
                .termService(joinDto.getTermService())
                .locationBased(joinDto.getLocationBased())
                .privacyPolicy(joinDto.getPrivacyPolicy())
                .promotionalInfo(joinDto.getPromotionalInfo())
                .build();

        Address address = Address.builder()
                .zipcode(joinDto.getZipcode())
                .mainAddress(joinDto.getMainAddress())
                .detailAddress(joinDto.getDetailAddress())
                .build();

        UserDetail userDetail = UserDetail.builder()
                .address(address)
                .email(joinDto.getEmail())
                .job(joinDto.getJob())
                .nationality(joinDto.getNationality())
                .passportNum(joinDto.getPassportNum())
                .gender(joinDto.getGender())
                .tel(joinDto.getTel()).build();

        User regUser = User.builder()
                .userRole("ROLE_USER")
                .password(bCryptPasswordEncoder.encode(joinDto.getPassword()))
                .username(joinDto.getUsername())
                .fullName(fullName)
                .userDetail(userDetail)
                .birthday(joinDto.getBirthday())
                .terms(terms)
                .build();

        userRepository.save(regUser);
    }

    public LoginDto loginUser(String username) {
        User user = userRepository.findUserByUsername(username);
        LoginDto loginDto = LoginDto.builder().birthday(user.getBirthday()).fullName(user.getFullName()).username(user.getUsername()).build();

        return loginDto;
    }

    public boolean idUsed(String username) {
        User userEntity = userRepository.findUserByUsername(username);
        if(userEntity == null) {
            return false;
        }
        return true;
    }

}
