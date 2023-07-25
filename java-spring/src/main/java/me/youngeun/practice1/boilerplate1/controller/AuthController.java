package me.youngeun.practice1.boilerplate1.controller;

import lombok.RequiredArgsConstructor;
import me.youngeun.practice1.boilerplate1.model.dto.JwtTokenDto;
import me.youngeun.practice1.boilerplate1.model.dto.MemberRequestDto;
import me.youngeun.practice1.boilerplate1.model.dto.MemberResponseDto;
import me.youngeun.practice1.boilerplate1.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/signup")
    public ResponseEntity<MemberResponseDto> signup(@RequestBody MemberRequestDto requestDto) {
        return ResponseEntity.ok(authService.signup(requestDto));
    }

    @PostMapping("/login")
    public ResponseEntity<JwtTokenDto> login(@RequestBody MemberRequestDto requestDto) {
        return ResponseEntity.ok(authService.login(requestDto));
    }
}
