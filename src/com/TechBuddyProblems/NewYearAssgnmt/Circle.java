package com.TechBuddyProblems.NewYearAssgnmt;

public  class Circle extends Shape1{

    @Override
    public void getArea(float r) {
        System.out.println("Area of Circle : " + 3.14*r*r);
    }

    @Override
    public void getPerimeter(float r) {
        System.out.println("Perimeter of Cirlce : " + 2*3.14*r);
    }

    public static void main(String[] args) {
        Shape1 circle = new Circle();
        circle.getArea(3f);
        circle.getPerimeter(3f);
    }
}
