package org.example.hotel;

public class Hotel {
    private String name;
    private Room[] nbRoom;
    private Reservation[] nbReservation;
    private Client[] clients;

    public Hotel(String name) {
        this.name = name;
    }

    public Hotel(String name, Room[] nbRoom) {
        this.name = name;
        this.nbRoom = nbRoom;
        this.nbReservation = new Reservation[100];
        this.clients = new Client[100];
    }

    public Hotel(String name, Room[] nbRoom, Reservation[] nbReservation, Client[] clients) {
        this.name = name;
        this.nbRoom = nbRoom;
        this.nbReservation = nbReservation;
        this.clients = clients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Room[] getNbRoom() {
        return nbRoom;
    }

    public void setNbRoom(Room[] nbRoom) {
        this.nbRoom = nbRoom;
    }

    public Reservation[] getNbReservation() {
        return nbReservation;
    }

    public void setNbReservation(Reservation[] nbReservation) {
        this.nbReservation = nbReservation;
    }

    public Client[] getClients() {
        return clients;
    }

    private int cptIdClient = 0;
    private int cptIdResa = 0;

    public void setClients(Client[] clients) {
        this.clients = clients;
    }

    public boolean addClient(String firstName, String lastname, String phone) {
        Client client = new Client(firstName, lastname, phone);
        if (cptIdClient < 100){
            clients[cptIdClient++] = client;
        return true;
    }
        return false;
}
    public boolean addResa(Reservation reservation) {
        if (cptIdResa < 100){
            nbReservation[cptIdResa++] = reservation;
            return true;
        }
        return false;
    }
}
