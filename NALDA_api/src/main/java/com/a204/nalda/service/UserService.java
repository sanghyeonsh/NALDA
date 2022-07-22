package com.a204.nalda.service;

import com.a204.nalda.domain.embedded.Address;
import com.a204.nalda.domain.embedded.FullName;
import com.a204.nalda.domain.entity.user.Terms;
import com.a204.nalda.domain.entity.user.User;
import com.a204.nalda.domain.entity.user.UserDetail;
import com.a204.nalda.dto.user.JoinDto;
import com.a204.nalda.dto.user.LoginDto;
import com.a204.nalda.dto.user.UserDetailDto;
import com.a204.nalda.dto.user.UserModifyDto;
import com.a204.nalda.repository.UserDetailRepository;
import com.a204.nalda.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserDetailRepository userDetailRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    @Transactional
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
    @Transactional
    public UserDetailDto findUserDetail(String username) {
        UserDetail userDetail = userDetailRepository.findByUsername(username);
        UserDetailDto userDetailDto = UserDetailDto.builder()
                .address(userDetail.getAddress())
                .job(userDetail.getJob())
                .tel(userDetail.getTel())
                .email(userDetail.getEmail())
                .gender(userDetail.getGender())
                .nationality(userDetail.getNationality())
                .passportNum(userDetail.getPassportNum())
                .build();

        return userDetailDto;
    }
    @Transactional
    public void modifyUser(UserModifyDto userModifyDto) {
        User user = userRepository.findUserByUsername(userModifyDto.getUsername());

        UserDetail userDetail = UserDetail.builder()
                .address(userModifyDto.getAddress())
                .email(userModifyDto.getEmail())
                .gender(userModifyDto.getGender())
                .job(userModifyDto.getJob())
                .tel(userModifyDto.getTel())
                .nationality(userModifyDto.getNationality())
                .passportNum(userModifyDto.getPassportNum())
                .build();

        user.modifyUserDetail(userDetail);
        user.modifyUserInfo(userModifyDto.getFullName(), bCryptPasswordEncoder.encode(userModifyDto.getPassword()));

    }


}
