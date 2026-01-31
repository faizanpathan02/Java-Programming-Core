package com.TechBuddyProblems.NewYearAssgnmt;

public class Car extends Vehicle{

    @Override
    public void drive() {
        System.out.println("Car repairing");
    }

    public static void main(String[] args) {
        Vehicle v = new Car();
        v.drive();
    }
}
