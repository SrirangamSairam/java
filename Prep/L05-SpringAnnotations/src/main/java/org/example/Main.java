package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("org.example");
        NotificationService notificationService = (NotificationService) applicationContext.getBean("notificationService");
        notificationService.sendNotification("Hello User");
    }
}