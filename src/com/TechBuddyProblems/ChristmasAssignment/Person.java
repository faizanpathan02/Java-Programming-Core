package com.TechBuddyProblems.ChristmasAssignment;

public class Person {

    String name;
    int age;

    Person(String name , int age){
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Person faizan =  new Person("Faizan", 24);
        Person arman = new Person("Arman", 22);
        System.out.println(faizan.name+" "+faizan.age);
        System.out.println(arman.name+" "+arman.age);
    }
}
