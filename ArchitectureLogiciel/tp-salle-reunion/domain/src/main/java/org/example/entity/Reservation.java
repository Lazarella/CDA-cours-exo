package org.example.entity;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;

public class Reservation {
    private long id;
    private Room room;
    private Person person;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;

        public Reservation(Builder builder){
            this.setId(builder.id);
            this.setRoom(builder.room);
            this.setPerson(builder.person);
            this.setEndDateTime(builder.endDateTime);
            this.setStartDateTime(builder.startDateTime);


        }
    public static class Builder{
        private long id;
        private Room room;
        private Person person;
        private LocalDateTime startDateTime;
        private LocalDateTime endDateTime;


        public Builder id(long id){
            this.id = id;
            return this;
        }
        public Builder room(Room room){
            this.room = room;
            return this;
        }
        public Builder person(Person person){
            this.person = person;
            return this;
        }
        public Builder startDateTime(LocalDateTime startDateTime){
            this.startDateTime = startDateTime;
            return this;
        }
        public Builder endDateTime(LocalDateTime endDateTime){
            this.endDateTime = endDateTime;
            return this;
        }
        public Reservation build(){
            return new Reservation(this);
        }
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(LocalDateTime startDateTime) {
        this.startDateTime = startDateTime;
    }

    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(LocalDateTime endDateTime) {
        this.endDateTime = endDateTime;
    }
}
