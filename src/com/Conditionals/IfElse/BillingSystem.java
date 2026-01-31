package com.Conditionals.IfElse;

public class BillingSystem {
    public static void main(String[] args) {
        int units = 350;
        int bill;

        if (units <= 100) {
            bill = units * 2;
        } else if (units <= 200) {
            bill = units * 3;
        } else if (units <= 300) {
            bill = units * 4;
        } else if (units <= 400) {
            bill = units * 5;
        } else {
            bill = units * 6;
        }

        System.out.println("Total Bill: ₹" + bill);
    }
}
