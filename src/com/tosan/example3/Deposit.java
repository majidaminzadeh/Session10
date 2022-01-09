package com.tosan.example3;

public class Deposit {
    private String depositNumber;
    private String customerName;
    private int balance;
    private static final int MAX_BALANCE = 200;

    public void defray(int balance) throws MaxBalanceException{
        if(getBalance() + balance > MAX_BALANCE){
//            System.out.println("Balance over the MAX");
            throw new MaxBalanceException("Max exception occurred");
        }
        setBalance(getBalance() + balance);
    }

    public void withdrawal(int balance) throws MinBalanceException{
        if(getBalance() - balance < 0){
            throw new MinBalanceException("Min exception occurred");
        }
        setBalance(getBalance() - balance);
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setDepositNumber(String depositNumber) {
        this.depositNumber = depositNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getDepositNumber() {
        return depositNumber;
    }
}
