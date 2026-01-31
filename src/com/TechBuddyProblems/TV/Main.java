package com.TechBuddyProblems.TV;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV();

        tv.setChannel(3);
        tv.setVolumeLevel(5);
        tv.setOn(true);

        System.out.println("\nTV on/off Status :" + tv.isOn());
        System.out.println("TV Channel : " + tv.getChannel());
        System.out.println("TV Volume Level : " + tv.getVolumeLevel());
    }
}
