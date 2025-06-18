package com.jvmcosta.app;

import java.util.Locale;
import java.util.Scanner;

import com.jvmcosta.entities.CurrencyConverter;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        CurrencyConverter cc = new CurrencyConverter();

        cc.setDollarPrice(3.1);

        cc.setAmountToBeBought(200);

        System.out.println(cc.currencyConverter());

        sc.close();
    }
}
