package com.Abstraction.Interface.Practice.PlayableProblem;

public class Hockey implements Playable{

    @Override
    public void play() {
        System.out.println("Hockey");
        System.out.println("Team size : 11");
        System.out.println("Rule : Stick and ball game");
    }
}
