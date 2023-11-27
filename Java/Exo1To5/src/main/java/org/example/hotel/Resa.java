package org.example.hotel;

public class Resa {
    private int Resa;
    protected RoomStatus roomStatus;

    protected Client client;

    protected  int nbRoom;

    public Resa(int resa, RoomStatus roomStatus, Client client, int nbRoom) {
        Resa = resa;
        this.roomStatus = roomStatus;
        this.client = client;
        //this.nbRoom = nbRoom;
    }
   
}
