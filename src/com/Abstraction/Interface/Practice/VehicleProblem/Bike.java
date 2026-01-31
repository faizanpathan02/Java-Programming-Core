package com.Abstraction.Interface.Practice.VehicleProblem;

public class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike started");

    }

    public static void main(String[] args) {

        Vehicle v1 = new  Bike();
        Vehicle v2 = new Car();
        v1.start();
        v2.start();
    }
}
