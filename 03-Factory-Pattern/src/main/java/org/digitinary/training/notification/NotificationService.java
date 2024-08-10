package org.digitinary.training.notification;

import org.digitinary.training.notification.creator.NotificationCreator;
import org.digitinary.training.notification.product.Notification;
import org.digitinary.training.notification.product.PushNotification;

public class NotificationService {
    public static void main(String[] args) {
        NotificationCreator notificationCreator = new NotificationCreator();
        Notification notification = notificationCreator.createNotification("SMS");
        notification=notificationCreator.createNotification("PUSH");
        notification.notifyUser();
    }
}
