package com.CovariantReturnType;

public class EmailNotifications extends Notifications {

    @Override
    public EmailNotifications getDetails() {
        EmailNotifications en = new EmailNotifications();

        System.out.println("Email Notifications");
        System.out.println("Email sent to user@gmail.com");
        return en;
    }

    public static void main(String[] args) {

        Notifications notifications = new EmailNotifications();
        notifications.getDetails();
    }
}
