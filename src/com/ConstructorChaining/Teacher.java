package com.ConstructorChaining;

public class Teacher extends School {

    public Teacher() {
        super("NBJC", 223);
        System.out.println("Default constructor of Teacher");
    }
    public Teacher(int teacherID) {
        this();
        System.out.println("Teacher ID is : " + teacherID);
    }
    public Teacher(int teacherID,String teacherName) {
        this(334);
        System.out.println("Teacher name is : " + teacherName);
    }
}
