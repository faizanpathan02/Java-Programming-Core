package com.Abstraction.Interface.Practice.PlayableProblem;

public class SportsTest {

    public static void main(String[] args) {

        System.out.println(" ");
        Playable p1 = new Cricket();
        p1.play();
        System.out.println(" ");

        Playable p2 = new Football();
        p2.play();
        System.out.println(" ");

        Playable p3 = new Hockey();
        p3.play();
    }
}
