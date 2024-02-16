package org.example.entity;


public class Room {
long id ;
String name;
int capacity;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    private Room(Builder builder){
        this.setId(builder.id);
        this.setName(builder.name);
        this.setCapacity(builder.capacity);
    }

    public static class Builder {

        private long id;
        private String name;
        private int capacity;
        public Builder id(long id){
            this.id = id;
            return this;
        }
        public Builder name(String name){
            this.name = name;
            return this;
        }
        public Builder capacity(int capacity){
            this.capacity = capacity;
            return this;
        }
        public Room build(){
            return new Room(this);
        }
    }
}
