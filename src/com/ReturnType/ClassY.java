package com.ReturnType;

public class ClassY {

    int i = 10;
    int j = 90;
    int k;

    public ClassY m2(){
        ClassY y = new ClassY();
        System.out.println(y.i+" "+ y.j+" "+y.k);
        ClassY y1 = new ClassY();
        y1.i = 77;
        y1.j = 67;
        System.out.println(y1.i+" "+y1.j+" "+y1.k);
        int i = 100;
        int j = 200;
        int k = 300;
        ClassY y2 = new ClassY();
        y2.i = k;
        y2.j = y1.i;
        y2.k = j;
        System.out.println(i +" "+ y2.j + " "+ k);
        ClassY y3 = new ClassY();
        System.out.println(y3.i+" "+y3.j+" "+y3.k);
        return y2;
    }

    public static void main(String[] args) {

        ClassY y6 =new ClassY();
        System.out.println(y6.i+" "+y6.j+" "+y6.k);
        ClassY y7 = y6.m2();
        System.out.println(y7.i+" "+y7.j+" "+y7.k);
    }
}
