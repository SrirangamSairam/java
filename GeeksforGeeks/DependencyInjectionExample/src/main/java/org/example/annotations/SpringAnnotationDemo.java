package org.example.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringAnnotationDemo {
    @Bean
    public SMSGateway smsGateway() {
        return new SMSGateway();
    }
    @Bean
    public NotificationService notificationService() {
        return new NotificationService(smsGateway());
    }
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringAnnotationDemo.class);
        NotificationService notificationService = (NotificationService) context.getBean("notificationService");
        notificationService.sendNotification("Hello sir from Notification service bean");
        SMSGateway smsGateway = (SMSGateway) context.getBean("smsGateway");
        smsGateway.sendSMS("Hello sir from sms gateway bean");
    }
}
