package com.jvmcosta.entities;

public class Account {
    private String holder;
    private int number;
    private double balance;

    public Account(String holder, int number){
        this.holder = holder;
        this.number = number;
    }
    
    
    public Account(String holder, int number, double deposit){
        this.holder = holder;
        this.number = number;
        deposit(deposit);
    }

    /**
     * @return String return the holder
     */
    public String getHolder() {
        return holder;
    }

    /**
     * @param holder the holder to set
     */
    public void setHolder(String holder) {
        this.holder = holder;
    }

    /**
     * @return int return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @return double return the balance
     */
    public double getBalance() {
        return balance;
    }

    public void deposit(double deposit){
        this.balance += deposit;
    }

    public void withdraw(double withdraw){
        this.balance -= withdraw;
    }

}
