package com.Abstraction.Interface.Practice.CurrencyProblem;

public class CurrencyTest {

    public static void main(String[] args) {

        Currency inr = new IndianRupees();
        Currency eur = new Euro();

        System.out.println("Amount in Rupees : " + inr.convertTOUSD(100) + inr.SYMBOL);
        System.out.println("Amount in Euros : " + eur.convertTOUSD(100) + eur.SYMBOL);
    }
}
