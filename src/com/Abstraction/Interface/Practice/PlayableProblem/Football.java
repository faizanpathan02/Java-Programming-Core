package com.Abstraction.Interface.Practice.PlayableProblem;

public class Football implements  Playable {

    @Override
    public void play() {
        System.out.println("Football");
        System.out.println("Team size : 11");
        System.out.println("Rule : No hands except goalkeeper");
    }
}
