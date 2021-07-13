package com.min.mail.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.min.mail.project.dao.LoginDAO;
import com.min.mail.project.dto.request.LoginDto;
import com.min.mail.project.dto.response.LoginResponseDto;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginDAO loginDao;
	
	
	@Override
	public LoginResponseDto login(LoginDto request) {
		return loginDao.login(request);
	}

}
