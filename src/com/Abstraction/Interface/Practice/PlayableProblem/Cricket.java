package com.Abstraction.Interface.Practice.PlayableProblem;

public class Cricket implements Playable{

    @Override
    public void play() {
        System.out.println("Cricket");
        System.out.println("Team size : 11");
        System.out.println("Rule : Bat and Ball game");
    }
}
