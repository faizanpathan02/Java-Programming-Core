package com.MethodOverriding.Vehicle;

public class Bike extends Vehicle{

    @Override
    public void move() {
        System.out.println("Bike moves on two wheels");
    }
}
