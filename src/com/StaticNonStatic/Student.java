package com.StaticNonStatic;

public class Student {

    static {
        System.out.println("Student static block");
    }

    Student() {
        System.out.println("\nStudent constructor");
    }

    {
        System.out.println("\nStudent non static block");
    }

    public static void main(String[] args) {
        System.out.println("\nMain start");

        Student student = new Student();
        Student student1 = new Student();


        System.out.println("\nMain end");
    }
}
