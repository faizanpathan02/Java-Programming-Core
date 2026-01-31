package com.TechBuddyProblems.PrimitiveReturnTypes;

public class ReturnTypes {

    public byte getByte(){
        byte b = 2;
        return b;
    }
    public short getShort(){
        short s = 2;
        return s;
    }
    public int getInt(){
        int i = 1;
        return i ;
    }
    public long getLong(){
        long l = 11234567890l;
        return l;
    }
    public float getFloat(){
        float f = 1.1f;
        return f;
    }
    public double getDouble(){
        double d = 1.1;
        return d;
    }
    public char getChar(){
        char c = 'a';
        return c;
    }
    public boolean getBoolean(){
        boolean b = true;
        return b;
    }



    public static void main(String[] args) {
        ReturnTypes obj = new ReturnTypes();
        System.out.println(obj.getByte());
        System.out.println(obj.getShort());
        System.out.println(obj.getInt());
        System.out.println(obj.getLong());
        System.out.println(obj.getFloat());
        System.out.println(obj.getDouble());
        System.out.println(obj.getChar());
        System.out.println(obj.getBoolean());
    }
}
