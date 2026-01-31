package com.TechBuddyProblems.ChristmasAssignment;

public class Dog {
    private String name;
    private String breed;

    Dog(String name , String breed){
        this.name = name;
        this.breed = breed;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getBreed(){
        return this.breed;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Ross", "Bulldog");
        System.out.println(dog.name +" " + dog.breed);

        dog.setName("Tommy");
        dog.setBreed("Husky");
        System.out.println(dog.name +" " + dog.breed);
    }

}
