package com.notification;

import static com.notification.NotificationBuilder.buildNotificationSingleThreaded;

public class App
{
    public static void main( String[] args ){

        String notification = buildNotificationSingleThreaded("Alice", "booking");
        System.out.println(notification);
    }
}
