package com.datatypes;

public class Car {


        // Primitive data types
        byte gears;
        short fuelCapacity;
        int engineCC;
        long registrationNumber;
        float mileage;
        double price;
        char rating;
        boolean isAutomatic;

        // Non-primitive data types
        String brand;
        String model;
        String fuelType;

        void displayDetails() {
            System.out.println("Brand: " + brand);
            System.out.println("Model: " + model);
            System.out.println("Fuel Type: " + fuelType);
            System.out.println("Engine: " + engineCC + " CC");
            System.out.println("Mileage: " + mileage + " km/l");
            System.out.println("Price: ₹" + price);
            System.out.println("Gears: " + gears);
            System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Rating: " + rating);
            System.out.println("Automatic: " + isAutomatic);
        }

        public static void main(String[] args) {
            Car car = new Car();

            car.brand = "Toyota";
            car.model = "Fortuner";
            car.fuelType = "Diesel";
            car.engineCC = 2755;
            car.mileage = 14.2f;
            car.price = 3800000.0;
            car.gears = 6;
            car.fuelCapacity = 80;
            car.registrationNumber = 9876543210L;
            car.rating = 'A';
            car.isAutomatic = true;

            car.displayDetails();
        }
    }


