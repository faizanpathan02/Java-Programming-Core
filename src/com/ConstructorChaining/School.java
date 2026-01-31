package com.ConstructorChaining;

public class School {

    public School() {
        System.out.println("Default constructor of School");
    }
    public School(int schoolID) {
        this();
        System.out.println("School ID is : " + schoolID);
    }
    public School(String schoolName,int schoolID) {
        this(1102);
        System.out.println("School name is : " + schoolName);
    }
}
