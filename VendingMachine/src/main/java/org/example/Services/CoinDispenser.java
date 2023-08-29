package org.example.Services;

public class CoinDispenser {
    private int balance = 0;

    public int getBalance() {
        return balance;
    }
    public void putCoin(int coinValue) {
        balance += coinValue;
    }

    public void withdraw (int amount) {
        balance -= amount;
    }

    public void purchase (int price) {
        balance -= price;
    }

}