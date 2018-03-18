package com.example.demo.mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class MockMailSender implements MailSender{

	private static Log log = LogFactory.getLog(MockMailSender.class);
	
	@Override
	public void sendMail(String to, String subject, String body) {
		// TODO Auto-generated method stub
		log.info("sending demo mail from dev env");
	}

}
