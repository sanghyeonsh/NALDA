package com.a204.nalda.controller;

import com.a204.nalda.dto.user.JoinDto;
import com.a204.nalda.dto.user.UserDetailDto;
import com.a204.nalda.dto.user.UserModifyDto;
import com.a204.nalda.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/userDetail/{username}")
    public ResponseEntity<?> getUserDetail(@PathVariable("username") String username) {
        Map<String, Object> result = new HashMap<>();
        UserDetailDto userDetailDto = userService.findUserDetail(username);
        result.put("info", userDetailDto);

        return new ResponseEntity<>(result,HttpStatus.OK);
    }

    @PutMapping("/userDetail")
    public ResponseEntity<?> modifyUser(@RequestBody UserModifyDto userModifyDto) {
        Map<String, Object> result = new HashMap<>();
        try {
            userService.modifyUser(userModifyDto);
            result.put("msg", "회원이 정상적으로 수정되었습니다.");
        } catch (Exception e) {
            result.put("msg", "오류가 발생했습니다.");
        }
        return new ResponseEntity<>(result,HttpStatus.OK);

    }

    @GetMapping("/idCheck/{username}")
    public ResponseEntity<?> idCheck(@PathVariable("username") String username) {
        Map<String,Object> result = new HashMap<>();

        if(userService.idUsed(username)) {
            result.put("msg", "사용중인 아이디입니다.");
        } else {
            result.put("msg", "사용 가능한 아이디입니다.");
        }
        return new ResponseEntity<>(result,HttpStatus.OK);
    }

}
