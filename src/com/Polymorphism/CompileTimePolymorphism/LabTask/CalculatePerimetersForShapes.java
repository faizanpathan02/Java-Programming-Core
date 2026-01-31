package com.Polymorphism.CompileTimePolymorphism.LabTask;

public class CalculatePerimetersForShapes {

    public void calculatePerimeter(int a , int b , int c){
        System.out.println("\nPerimeter of Triangle : " + (a+b+c));
    }

    public void calculatePerimeter(float a , int b ){
        System.out.println("\nPerimeter of Rectangle : " + (2*(a+b)));
    }

    public void calculatePerimeter(double s){
        System.out.println("\nPerimeter of Square : " + 4*(s));
    }

    public void calculatePerimeter(int a , int b , double c , int d){
        System.out.println("\nPerimeter of Trapezoid : " + (a+b+c+d));
    }

    public static void main(String[] args) {
        CalculatePerimetersForShapes c = new CalculatePerimetersForShapes();
        c.calculatePerimeter(2,3,5);
        c.calculatePerimeter(2.5f,4);
        c.calculatePerimeter(4);
        c.calculatePerimeter(2,4,4.55,3);
    }
}
