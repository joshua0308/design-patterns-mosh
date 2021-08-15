package com.company.essentials;

public class Account {
    private float balance;

    public void deposit(float amount) {
        if (amount > 0)
            this.balance += amount;
    }

    public void withdraw(float amount) {
        if (amount > 0)
            this.balance -= amount;
    }

    // setter
    public void setBalance(float balance) {
        if (balance > 0)
            this.balance = balance;
    }

    // getter
    public float getBalance() {
        return balance;
    }
}
