package org.example.enumjava;

import java.util.Scanner;

import static org.example.enumjava.MessageType.A;

public class Message {

   protected MessageType message ;
   protected MessagePriority priority;

    public Message(MessageType message, MessagePriority priority) {
        this.message = message;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Message{" +
                "message=" + message +
                ", priority=" + priority +
                '}';
    }
}
