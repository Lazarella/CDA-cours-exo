package org.example.hotel;

import java.util.Scanner;

public class ClientList {
    protected Client client ;

    public ClientList(Client client) {
        this.client = client;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

}
