package com.Polymorphism.CompileTimePolymorphism;

public class MethodOverloading {

    public int sum(int a, int b) {
        return a + b;
    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    public int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();

        System.out.println(obj.sum(1,4));
        System.out.println(obj.sum(10,39,42));
        System.out.println(obj.sum(39,28,42,12));
    }

}
