package com.TypeCasting;

public class TypeCasting {

    public void explicitCasting(){
//        long l = 12345242455342342L;
//        int aa = (int) l;
//        System.out.println(l);
//        System.out.println(aa);

        double dd = 1334.5554;
        int a1 = (int)dd;
        System.out.println(dd);
        System.out.println(a1);
    }

    public void implicitCasting(){
        int a = 10;
        double d = a;
        System.out.println(a);
        System.out.println(d);
    }

    public static void main(String[] args) {

        TypeCasting obj = new TypeCasting();
        obj.implicitCasting();
        System.out.println(" ");

        obj.explicitCasting();

    }
}
