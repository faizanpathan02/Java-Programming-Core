package com.datatypes;

public class DataTypeExample {

    byte b = 123;
    byte b1;

    short s = 200;
    short s1;

    int i = 133333;
    int i1;

    long l = 123456789;
    long l1;

    float f = 100.33f;
    float f1;

    double d = 1444.333333343333;
    double d1;

    char c = 'A';
    char c1;

    String str = "abc";
    String str1;

    public void m1(){

        byte b = 123;
        byte b1;

        short s = 200;
        short s1;

        System.out.println(b);


    }

    public static void main(String[] args) {
        DataTypeExample d = new DataTypeExample();
        System.out.println(d.b);
        System.out.println(d.b1);
        System.out.println(d.s);
        System.out.println(d.s1);
        System.out.println(d.i);
        System.out.println(d.i1);
        System.out.println(d.l);
        System.out.println(d.l1);
        System.out.println(d.f);
        System.out.println(d.f1);
        System.out.println(d.d);
        System.out.println(d.d1);
        System.out.println(d.c);
        System.out.println(d.c1);
        System.out.println(d.str);
        System.out.println(d.str1);
        System.out.println("  ");

        d.m1();

    }
}
