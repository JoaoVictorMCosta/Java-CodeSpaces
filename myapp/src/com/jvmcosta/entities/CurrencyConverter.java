package com.jvmcosta.entities;

public class CurrencyConverter {
    private double dollarPrice;
    private double amountToBeBought;
    private double iof = 6;

    public CurrencyConverter(){

    }

    public double getDollarPrice(){
        return dollarPrice;
    }

    public void setDollarPrice(double dollarPrice){
        this.dollarPrice = dollarPrice;
    }

    public void setAmountToBeBought(double amountToBeBought){
        this.amountToBeBought = amountToBeBought;
    }

    public double currencyConverter(){
        double sum =  dollarPrice*amountToBeBought;
        double percentage = iof/100;
        return sum+sum*percentage;
    }

}
