package com.Abstraction.Interface.Practice.CurrencyProblem;

public class IndianRupees implements Currency{

    @Override
    public double convertTOUSD(double amount) {
        return amount * 0.12;
    }
}
