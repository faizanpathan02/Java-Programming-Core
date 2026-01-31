package com.TechBuddyProblems.NewYearAssgnmt;

public class Cheetah extends Animal{

    @Override
    public void move() {
        System.out.println("Cheetah is the fastest running animal");
    }

    public void sleep(){
        System.out.println("Cheetah sleeps");
    }

    public static void main(String[] args) {
        Animal animal = new Cheetah();
        animal.move();
//        animal.sleep();
    }
}
