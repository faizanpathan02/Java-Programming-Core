package com.Conditionals.IfElse;

public class PayrollSystem {
    public static void main(String[] args) {
        int experience = 6;
        double salary = 50000;
        double bonus = 0;

        if (experience >= 10) {
            bonus = salary * 0.30;
        } else if (experience >= 5) {
            bonus = salary * 0.20;
        } else if (experience >= 2) {
            bonus = salary * 0.10;
        } else {
            bonus = 0;
        }

        System.out.println("Bonus: ₹" + bonus);
    }
}
