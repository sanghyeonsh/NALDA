package com.a204.nalda.controller;

import com.a204.nalda.dto.JoinDto;
import com.a204.nalda.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserService userService;


    @PostMapping("/join")
    public ResponseEntity<?> join(@RequestBody JoinDto joinDto) {
        Map<String, Object> result = new HashMap<>();
        if(userService.idUsed(joinDto.getUsername())) {
            result.put("msg","이미 존재하는 아이디 입니다.");
            return new ResponseEntity<>(result, HttpStatus.IM_USED);
        }
        userService.JoinUser(joinDto);
        result.put("msg", "회원가입이 완료 되었습니다.");
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

}
