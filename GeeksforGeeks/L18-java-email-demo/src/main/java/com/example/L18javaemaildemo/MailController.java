package com.example.L18javaemaildemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mail")
public class MailController {

    @Autowired
    private JavaMailSender javaMailSender;

    @PostMapping("/send")
    public ResponseEntity<String> sendMail(@RequestBody SendEmailRequest request) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setSubject(request.getSubject());
        simpleMailMessage.setTo(request.getToEmail());
        simpleMailMessage.setText(request.getBody());
        simpleMailMessage.setCc(request.getCc());
        javaMailSender.send(simpleMailMessage);
        return ResponseEntity.ok("Mail sent");
    }
}
