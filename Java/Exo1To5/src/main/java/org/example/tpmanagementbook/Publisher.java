package org.example.tpmanagementbook;

public class Publisher {
    private long id;
    protected String publisherName ;

    public Publisher(String publisherName) {
        this.id = getInt();
        this.publisherName = publisherName;
    }
    private long getInt(){
        id = Math.round(Math.random())*100000;
        return id;
    }
}
