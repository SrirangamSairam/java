package org.example;

import org.springframework.stereotype.Component;

@Component
public class SMSGateway {

    private String cost;

    public SMSGateway() {
        this.cost = "ten";
    }

    public void sendSMS(String data) {
        System.out.println("Sending SMS: "+ data +", cost is: "+ cost);
    }
}
