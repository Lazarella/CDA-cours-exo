package org.example.model;

public class Ticket {
    private int id;
    private Customer customer;
    private Event event;

    public Ticket(Customer customer, Event event) {
        this.customer = customer;
        this.event = event;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
    public void deleteTicket(){

    }

    @Override
    public String toString() {
        return "Ticket" +
                "id=" + id +
                ", customer = " + customer +
                ", event = " + event +
                '}';
    }
}
