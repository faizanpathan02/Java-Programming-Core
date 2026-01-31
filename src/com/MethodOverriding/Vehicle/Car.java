package com.MethodOverriding.Vehicle;

public class Car extends Vehicle{

    @Override
    public void move() {
        System.out.println("Car moves on four wheels");
    }

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        System.out.println(" ");
        vehicle.move();
        System.out.println(" ");

        vehicle = new Car();
        vehicle.move();
        System.out.println(" ");

        vehicle = new Bike();
        vehicle.move();
    }
}
