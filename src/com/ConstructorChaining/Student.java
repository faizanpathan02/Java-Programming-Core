package com.ConstructorChaining;

public class Student extends Teacher {

    public Student() {
        super(22,"Nilesh sir");
        System.out.println("Default constructor of Student");
    }
    public Student(int rollno) {
        this();
        System.out.println("Student roll number is : " + rollno);
    }
    public Student(String name, int rollno) {
        this(24105);
        System.out.println("Student name is : " + name);
    }
}
