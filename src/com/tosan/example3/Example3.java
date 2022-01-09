package com.tosan.example3;

public class Example3 {
    public static void main(String[] args) {
        Deposit deposit = new Deposit();
        deposit.setDepositNumber("1021");
        deposit.setCustomerName("Ali");
        deposit.setBalance(400);

        Deposit deposit2 = new Deposit();
        deposit2.setDepositNumber("210");
        deposit2.setCustomerName("Majid");
        deposit2.setBalance(50);

        try {
            transfer(deposit, deposit2, 300);
        } catch(BalanceException exception){
//            System.out.println(exception.getClass().getSimpleName());
//            System.out.println(exception.getMessage());
            exception.printStackTrace();
        }

//        try {
//            deposit.defray(2000);
//        } catch(MaxBalanceException exception){
//            System.out.println("Exception!!");
//            System.out.println(exception.getMessage());
//        }
//        try {
//            deposit.withdrawal(150);
//        }catch (MinBalanceException exception){
//            System.out.println("Exception!!");
//            System.out.println(exception.getMessage());
//        }
    }

    private static void transfer(Deposit deposit, Deposit deposit2, int balance) throws BalanceException{
        try {
            deposit.withdrawal(balance);
            deposit2.defray(balance);
        } catch (MinBalanceException exception){
//            System.out.println(exception.getClass().getSimpleName());
//            System.out.println("Min exception occurred");
//            throw new BalanceException(exception.getMessage(), exception);
        } catch (MaxBalanceException exception){
//            System.out.println(exception.getClass().getSimpleName());
//            System.out.println("Max exception occurred");
//            throw new BalanceException(exception.getMessage(), exception);
        }
        System.out.println("Success");
    }
}
