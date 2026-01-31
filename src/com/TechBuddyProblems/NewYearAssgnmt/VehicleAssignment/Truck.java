package com.TechBuddyProblems.NewYearAssgnmt.VehicleAssignment;

public class Truck extends Vehicle{

    String make = "Eicher";
    String model = "12 Tyre";
    int year = 2023;
    String fuelType = "Diesel";

    @Override
    public void fuelEfficiency() {
        System.out.println("\nMileage of Truck is 12 km/ltr ");
    }

    @Override
    public void distanceTravelled() {
        System.out.println("Distance travelled is 30000 km");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Max speed of Truck is 80 km/hr");
    }
}
