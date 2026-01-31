package com.CovariantReturnType;

public class Notifications {

    public Notifications getDetails(){

        Notifications notifications = new Notifications();

        System.out.println("Notification is on");
        return notifications;
    }
}
