package com.Polymorphism.CompileTimePolymorphism.LabTask;

public class VolumeCalculator {

    public void volume(int side){
        System.out.println("\nVolume of Cube : "+ side*side*side);
    }
    public void volume(double radius , double height){
        System.out.println("\nVolume of Cylinder : " + 3.142 * radius * radius * height);
    }
    public void volume(int l,int w,int h){
        System.out.println("\nVolume of Rectangular Box : " + l * w * h);
    }

    public static void main(String[] args) {
        VolumeCalculator vc = new VolumeCalculator();
        vc.volume(12);
        vc.volume(4,2,6);
        vc.volume(5,3,7);
    }

}
