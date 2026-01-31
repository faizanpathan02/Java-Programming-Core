package com.TechBuddyProblems.NewYearAssgnmt.VehicleAssignment;

public class Car extends Vehicle{

    String make = "Honda";
    String model = "Civic";
    int year = 2023;
    String fuelType = "Diesel";


    @Override
    public void fuelEfficiency() {
        System.out.println("\nMileage of Car is 18 km/ltr ");
    }

    @Override
    public void distanceTravelled() {
        System.out.println("Distance travelled is 40000 km");
    }

    @Override
    public void maxSpeed() {
        System.out.println("max speed of Car is 200 km/hr");
    }
}
