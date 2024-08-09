package org.digitinary.training.notification.creator;

import org.digitinary.training.notification.product.EmailNotification;
import org.digitinary.training.notification.product.Notification;
import org.digitinary.training.notification.product.PushNotification;
import org.digitinary.training.notification.product.SMSNotification;

public class NotificationCreator {
    public Notification createNotification(String channel){
           if(channel==null || channel.isEmpty()){
               return null;
           }switch (channel){
            case "SMS":
                return new SMSNotification();
            case "EMAIL":
                return new EmailNotification();
            case "PUSH":
                return new PushNotification();
            default:
                throw new IllegalArgumentException();
        }
    }
}
