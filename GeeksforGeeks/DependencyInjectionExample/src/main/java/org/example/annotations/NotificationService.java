package org.example.annotations;

public class NotificationService {
    private SMSGateway smsGateway;

    public NotificationService(SMSGateway smsGateway) {
        this.smsGateway = smsGateway;
    }
    public void sendNotification(String data) {
        smsGateway.sendSMS(data);
    }
}
