package com.notification;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class NotificationBuilder {

    public static String buildNotificationSingleThreaded(String recipient, String event){
        // Step 1: Create a StringBuilder instance
        StringBuilder message = new StringBuilder();

        // Step 2: Append the greeting
        message.append("Hi ").append(recipient).append(", ");

        // Step 3: Append the event info
        message.append("your ").append(event).append(" was successful.");

        // Step 4: Generate and format the timestamp
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String timestamp = now.format(formatter);

        // Step 5: Append the timestamp
        message.append("Timestamp: ").append(timestamp);

        // Step 6: Return the final message
        return message.toString();
    }


    public static String buildNotificationThreadSafe(String recipient, String event){
        // Step 1: Create a StringBuffer instance
        StringBuffer safeMessage = new StringBuffer();

        // Step 2: Append the greeting
        safeMessage.append("Hi ").append(recipient).append(", ");

        // Step 3: Append the event info
        safeMessage.append("this is to inform you that your ").append(event).append(" has been completed.");

        // Step 4: Generate and format the timestamp
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE-MMM-dd-yyyy HH:mm:ss");
        String timestamp = now.format(formatter);

        // Step 5: Append the timestamp
        safeMessage.append("Generated at : ").append(timestamp);

        // Step 6: Return the final message
        return safeMessage.toString();

    }
}
