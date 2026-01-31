package com.Abstraction.Interface.Practice.PaymentProblem;

public class CashPayment implements Payment{

    @Override
    public void pay(double amount) {
        System.out.println(amount + " Paid in Cash");
    }
}
