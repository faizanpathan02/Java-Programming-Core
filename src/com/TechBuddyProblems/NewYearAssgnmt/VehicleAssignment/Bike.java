package com.TechBuddyProblems.NewYearAssgnmt.VehicleAssignment;

public class Bike extends Vehicle{

    String make = "Royal Enfield";
    String model = "Himalayan";
    int year = 2023;
    String fuelType = "Petrol";


    @Override
    public void fuelEfficiency() {
        System.out.println("\nMileage of Bike is 50 km/ltr");
    }

    @Override
    public void distanceTravelled() {
        System.out.println("Distance travelled is 50000 km");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Max speed is 240 km/hr");
    }

    public static void main(String[] args) {
        System.out.println("\n-------------------BIKE DETAILS-----------------------");
        Vehicle himalayan = new Bike();
        himalayan.fuelEfficiency();
        himalayan.distanceTravelled();
        himalayan.maxSpeed();

        System.out.println("\n-------------------CAR DETAILS-----------------------");
        Vehicle civic = new Car();
        civic.fuelEfficiency();
        civic.distanceTravelled();
        civic.maxSpeed();

        System.out.println("\n-------------------TRUCK DETAILS-----------------------");
        Vehicle truck = new Truck();
        truck.fuelEfficiency();
        truck.distanceTravelled();
        truck.maxSpeed();
    }
}
