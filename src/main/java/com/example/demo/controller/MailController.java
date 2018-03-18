package com.example.demo.controller;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mail.MailSender;

@RestController
public class MailController {

	@Autowired
	MailSender sender;
	
	@RequestMapping("/mail")
	public String sendMail() throws MessagingException{
		sender.sendMail("nancy123@gmail.com", "Testing demo", "How are you?");
		return "Mail sent";
	}
}
