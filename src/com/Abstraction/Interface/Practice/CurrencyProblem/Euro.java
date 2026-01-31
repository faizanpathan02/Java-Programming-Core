package com.Abstraction.Interface.Practice.CurrencyProblem;

public class Euro implements Currency{

    @Override
    public double convertTOUSD(double amount) {
        return amount * 1.18;
    }
}
