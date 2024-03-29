package com.example.L18javaemaildemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

@SpringBootApplication
public class L18JavaEmailDemoApplication {

	@Bean
	public JavaMailSender javaMailSender() {
		JavaMailSenderImpl javaMailSender = new JavaMailSenderImpl();
		javaMailSender.setHost("smtp.gmail.com");
		javaMailSender.setUsername("sairamsrirangam111@gmail.com");
		javaMailSender.setPassword("vblsaigwrryhborh");
		javaMailSender.setPort(587);
		Properties properties = javaMailSender.getJavaMailProperties();
		properties.put("mail.smtp.starttls.enable", true);
		properties.put("mail.debug", true);
		return javaMailSender;
	}

	public static void main(String[] args) {
		SpringApplication.run(L18JavaEmailDemoApplication.class, args);
	}

}
