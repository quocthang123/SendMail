package com.min.mail.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.min.mail.project.dto.request.LoginDto;
import com.min.mail.project.dto.response.LoginResponseDto;
import com.min.mail.project.service.LoginService;

@RestController
@RequestMapping(path = "${api}/login")
public class LoginController {
	
	@Autowired
	private LoginService loginService;

	@PostMapping("/check-before-process")
		public ResponseEntity<LoginResponseDto> checkingBeforeProcess( LoginDto request) {
		return new ResponseEntity<>(loginService.login(request), HttpStatus.OK);
	}
	
//	@Autowired
//	private AuthenticationManager authenticationManager;
//	@Autowired
//	private TokenAuthenticationService jwtTokenUtil;
//	@Autowired
//
//	private JwtUserDetailsService userDetailsService;
//	@PostMapping("/logout")
//	public void logout() {
//		throw new IllegalStateException(
//				"This method shouldn't be called. It's implemented by Spring Security filters.");
//	}
//	
//	@PostMapping(value = "/login2")
//	public ResponseEntity<?> createAuthenticationToken(@RequestBody UserDTO authenticationRequest) throws Exception {
//		authenticate(authenticationRequest.getUsername(), authenticationRequest.getPassword());
//		
//		final User userDetails = userDetailsService.loadUserByUsername(authenticationRequest.getUsername());
//		final String token = jwtTokenUtil.generateToken(userDetails);
//		return ResponseEntity.ok(new JwtResponse(token));
//	}
//
//	private void authenticate(String username, String password) throws Exception {
//		try {
//			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
//		} catch (DisabledException e) {
//			throw new Exception("USER_DISABLED", e);
//		} catch (BadCredentialsException e) {
//			throw new Exception("INVALID_CREDENTIALS", e);
//		}
//	}

}
