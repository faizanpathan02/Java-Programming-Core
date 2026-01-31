package com.TechBuddyProblems.NewYearAssgnmt;

public class Dog extends Animal{

    @Override
    public void makeSound() {
        System.out.println("Dogs bark");
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        a.makeSound();
    }
}
