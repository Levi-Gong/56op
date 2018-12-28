package com.sinoservices.op.controller.auth;

import com.sinoservices.op.payload.JwtAuthenticationResponse;
import com.sinoservices.op.payload.LoginRequest;
import com.sinoservices.op.payload.SignUpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
  @PostMapping("/signin")
  public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {
    return ResponseEntity.ok(new JwtAuthenticationResponse(""));
  }

  @PostMapping("/signup")
  public ResponseEntity<?> registerUser(@Valid @RequestBody SignUpRequest signUpRequest) {

    return ResponseEntity.ok(new JwtAuthenticationResponse(""));
  }
}
