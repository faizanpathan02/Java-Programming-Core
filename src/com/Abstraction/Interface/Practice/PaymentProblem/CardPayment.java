package com.Abstraction.Interface.Practice.PaymentProblem;

import com.Inheritance.Demo.P;

public class CardPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println(amount + " Paid by Card");
    }


    public static void main(String[] args) {

        Payment p = new CardPayment();
        p.pay(400.3);

        Payment p2 = new CashPayment();
        p2.pay(400.3);
    }
}
