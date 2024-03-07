package org.example;

public class Account {
    int balance;

    String ownerName;

    public Account(int balance, String ownerName) {
        try {
            if(balance<0){
                throw new IllegalArgumentException();
            }
            this.balance = balance;
            this.ownerName = ownerName;
        }
            catch (IllegalArgumentException e){
                System.out.println("Ошибка ввода баланса");
            }


    }

    public void  putDeposit(int depositSum) {
        try{
            if(depositSum<0){
                throw new IllegalArgumentException();
            }
            int accountBalance = this.balance+depositSum;
            this.balance = accountBalance;
        }
        catch (IllegalArgumentException e){
            System.out.println("Нельзя указывать отрицательную сумму при депозие");
        }


    }

    public void  takeMoney(int moneySumTake) {
        try{
            if(moneySumTake<0 || this.balance-moneySumTake <0){
                throw new InsufficientFundsException(this.balance, "Маленький баланс");
            }
            int accountBalance = this.balance-moneySumTake;
            this.balance = accountBalance;
        }
        catch (InsufficientFundsException e){
            System.out.println(e.getMessage());
        }

    }

    @Override
    public String toString() {
        return ("Ваш баланс = " + this.balance +" рублей.  " + "Имя владельца =" + ownerName);
    }
    //фабричный метод

/*
    public  Account createAccount(String ownerName, int balance){

    }
    */

    }
