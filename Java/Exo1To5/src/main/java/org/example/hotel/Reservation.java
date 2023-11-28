package org.example.hotel;

public class Reservation {
    private static int count = 0;
    private int  num;
    private Client client;
    private Room room;
    private ResaStatus status;

    public Reservation(Client client, Room room, ResaStatus status) {
        this.num = ++count;
        this.client = client;
        this.room = room;
        this.status = status;
    }

    public ResaStatus getStatus() {
        return status;
    }

    public void setStatus(ResaStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Reservation" +
                "num=" + num +
                ", client =" + client +
                ", room =" + room +
                ", status =" + status +
                '.';
    }

}
