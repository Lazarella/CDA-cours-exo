package org.example.exo_banque.model;

import java.sql.Connection;

public class Account {
    private int id;
    private double balance;
    private int _clientId;

    public Account(double balance, int _clientId) {
        this.balance = 0.0;
        this._clientId = _clientId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int get_clientId() {
        return _clientId;
    }

    public void set_clientId(int _clientId) {
        this._clientId = _clientId;
    }

    public double getBalance() {
        return balance;
    }
}

