package org.digitinary.training.notification.product;

public class PushNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Sending an push notification");
    }
}
