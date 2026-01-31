package com.TechBuddyProblems.NewYearAssgnmt.Polymorphism;

public class Bird extends Cat{

    @Override
    public void Sound() {
        System.out.println("Birds chirp");
    }

    public static void main(String[] args) {
        Animal parrot = new Bird();
        parrot.Sound();

        Animal cat = new Cat();
        cat.Sound();
    }
}
