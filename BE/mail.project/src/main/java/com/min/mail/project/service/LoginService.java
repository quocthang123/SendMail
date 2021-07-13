package com.min.mail.project.service;

import com.min.mail.project.dto.request.LoginDto;
import com.min.mail.project.dto.response.LoginResponseDto;

public interface LoginService {
	public LoginResponseDto login(LoginDto request);
}
