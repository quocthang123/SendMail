package com.min.mail.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.min.mail.project.dto.request.LoginDto;
import com.min.mail.project.service.LoginService;
import com.min.mail.project.service.LoginServiceImpl;

@SpringBootApplication
public class Application {
	
	
	public static void main(String[] args) {
		LoginDto request = new LoginDto();
		request.setUserName("admin");
		request.setPassword("admin");
		LoginService loginService =new LoginServiceImpl();
		SpringApplication.run(Application.class, args);
		System.out.println(loginService.login(request));
	}

}
