package com.emailsent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emailsent.service.SendEmailService;

@RestController
public class EmailController {
	
	@Autowired
	private SendEmailService sendEmailService;
	
	
	@GetMapping("sendEmail")
	public String sendEmail() {
		
		sendEmailService.sendEmail("elightbroadbandservice@gmail.com", "test body", "test subject");
		
		return "sent successfully";
	}
}
