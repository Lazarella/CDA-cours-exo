package org.example.hotel;

public class Room {
    private int idRoom;
    private static int counter = 0;
    private int capacity;
    private double price;
    private RoomStatus roomstatus;

    public Room(int capacity, double price) {
        this.idRoom = ++counter;
        this.capacity = capacity;
        this.price = price;
        this.roomstatus = RoomStatus.EMPTY;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Room.counter = counter;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public RoomStatus getRoomstatus() {
        return roomstatus;
    }

    public void setRoomstatus(RoomStatus roomstatus) {
        this.roomstatus = roomstatus;
    }

    @Override
    public String toString() {
        return "Room{" +
                "nb=" + idRoom +
                ", capacity=" + capacity +
                ", price=" + price +
                ", roomstatus=" + roomstatus +
                '}';
    }
}
