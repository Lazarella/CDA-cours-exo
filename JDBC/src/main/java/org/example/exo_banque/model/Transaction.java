package org.example.exo_banque.model;

public class Transaction {
    private int numAccount;
    private int num;
    private double amount;
    private Status statut;

    public int getNumAccount(int account) {
        return numAccount;
    }

    public void setNumAccount(int numAccount) {
        this.numAccount = numAccount;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Status getStatut() {
        return statut;
    }

    public void setStatut(Status statut) {
        this.statut = statut;
    }
    public void withdrawal(){

    }
}
