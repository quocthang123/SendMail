package com.min.mail.project.dao;

import org.springframework.stereotype.Repository;

import com.min.mail.project.dto.request.LoginDto;
import com.min.mail.project.dto.response.LoginResponseDto;
@Repository
public interface LoginDAO {
	public LoginResponseDto login(LoginDto request);
}
