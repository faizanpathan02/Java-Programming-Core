package com.Polymorphism.CompileTimePolymorphism;

public class Payment {

    public void makePayment(double amount){

        System.out.println("Paid Rs."+amount+" Using Cash");
    }
    public void makePayment(double amount , String cardNumbere){
        System.out.println("Paid Rs." + amount + " Using Card");
    }

    public void makePayment(double amount , String upiId, boolean isUpi){
        System.out.println("Paid Rs." + amount + " Using UPI");
    }

    public static void main(String[] args) {
        Payment payment = new Payment();

        payment.makePayment(1000);
        payment.makePayment(2000,"3425-4534-7564");
        payment.makePayment(3000,"faizan@1232",true);
    }
}
