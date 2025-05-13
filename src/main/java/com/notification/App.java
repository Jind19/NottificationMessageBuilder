package com.notification;

import static com.notification.NotificationBuilder.buildNotificationSingleThreaded;
import static com.notification.NotificationBuilder.buildNotificationThreadSafe;

public class App
{
    public static void main( String[] args ){

        String fastNotification = buildNotificationSingleThreaded("Sarah", "login");
        System.out.println(fastNotification);

        String safeNotification = buildNotificationThreadSafe("Alex", "payment");
        System.out.println(safeNotification);
    }
}
