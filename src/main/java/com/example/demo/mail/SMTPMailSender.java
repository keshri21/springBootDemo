package com.example.demo.mail;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
@Profile("!dev")
public class SMTPMailSender implements MailSender{
	private static Log log = LogFactory.getLog(SMTPMailSender.class);
			
	private JavaMailSender mailSender;
	
	public SMTPMailSender(JavaMailSender mailSender) {
		// TODO Auto-generated constructor stub
		this.mailSender = mailSender;
	}

	@Override
	public void sendMail(String to, String subject, String body) throws MessagingException{
		// TODO Auto-generated method stub
		log.info("Sending real mail from prod");
		MimeMessage message = mailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message, true); //true indicates multipart message
		
		helper.setSubject(subject);
		helper.setText(body);
		helper.setTo(to);
		
		mailSender.send(message);
	}

	
}
