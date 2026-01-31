package com.TechBuddyProblems.ChristmasAssignment;

import com.Inheritance.Demo.R;

public class Rectangle {

    float width;
    float height;

    Rectangle(float width, float height){
        this.width = width;
        this.height = height;
    }

    public float rectangleArea(float width, float height){
        return width * height;

    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 10);
        System.out.println("\nArea of rectangle is " + rectangle.rectangleArea(10, 10));
    }
}
