package com.CovariantReturnType;

public class SMSNotifications extends Notifications {

    @Override
    public SMSNotifications getDetails() {
        SMSNotifications sn = new SMSNotifications();
        System.out.println("SMS Notifications");
        System.out.println("SMS for JQ-660044");
        return sn;
    }

    public static void main(String[] args) {
        SMSNotifications sn1 = new SMSNotifications();
        sn1.getDetails();
    }
}
