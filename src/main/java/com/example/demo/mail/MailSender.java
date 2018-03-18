package com.example.demo.mail;

import javax.mail.MessagingException;

public interface MailSender {
	public void sendMail(String to, String subject, String body) throws MessagingException;
}
