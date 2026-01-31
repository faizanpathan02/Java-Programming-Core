package com.TechBuddyProblems.TV;

public class TV {

    private int channel;
    private int volumeLevel;
    private boolean isOn;

    TV(){
        channel = 1;
        volumeLevel = 4;
        isOn = true;
    }

    public int getChannel(){
        return channel;
    }
    public void setChannel(int channel){
        this.channel = channel;
    }
    public int getVolumeLevel(){
        return volumeLevel;
    }
    public void setVolumeLevel(int volumeLevel){
        this.volumeLevel = volumeLevel;
    }
    public boolean isOn(){
        return isOn;
    }
    public void setOn(boolean isOn){
        this.isOn = isOn;
    }

    public void turnOff(){
        isOn = false;
    }
    public void turnOn(){
        isOn = true;
    }
    public void volumeUp(){
        if (isOn){
            volumeLevel++;
        }
    }
    public void volumeDown(){
        if (isOn){
            volumeLevel--;
        }
    }
    public void channelUp(){
        if(isOn){
            channel++;
        }
    }
    public void channelDown(){
        if(isOn){
            channel--;
        }
    }

    @Override
    public String toString() {
        return "TV{" +
                "channel=" + channel +
                ", volumeLevel=" + volumeLevel +
                ", isOn=" + isOn +
                '}';
    }
}
