package com.TechBuddyProblems.NewYearAssgnmt;

public class Rectangle extends Shape {

    @Override
    public void getArea(float l, float b) {
        System.out.println("\nArea of Rectangle : " + l*b);


    }

    public static void main(String[] args) {
        Shape shape = new Rectangle();
        shape.getArea(4.5f,3.5f);
    }
}
