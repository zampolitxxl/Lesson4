package org.example;

public class InsufficientFundsException extends  Exception{
    int balance;
    public InsufficientFundsException(int balance, String message) {
        super();
        this.balance = balance;
    }

    /**
     * Длина пароля
     */

    /**
     * Признак совпадения значений пароля и подтверждения пароля
     */

    @Override
    public String getMessage() {
        return String.format("Вы ввели некоретктное значение для снятие денег, ваш  текущий баланс = " + this.balance);
    }

}
