package com.Abstraction.Interface.Practice.CalculatorProblem;

public class BasicCalculator implements Calculator{


    @Override
    public void add(int a, int b) {
        System.out.println("Addition of numbers is: " + a + " + " + b + " = " + (a + b));

    }

    @Override
    public void sub(int a, int b) {
        System.out.println("Subtraction of numbers is: " + a + " - " + b + " = " + (a - b));

    }

    public static void main(String[] args) {
        Calculator calc = new BasicCalculator();
        calc.add(1,2);
        calc.sub(3,2);
    }
}
