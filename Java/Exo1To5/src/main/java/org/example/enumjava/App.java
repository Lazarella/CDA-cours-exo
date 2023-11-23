package org.example.enumjava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);
    public static void getMessage() {
        String userChoice;
        String userChoicePriority;
        MessageType messageType;
        MessagePriority messagePriority;
        boolean userIsWrong = true;



        do {
            System.out.println("Entrez un type de message (A, B, C ou D");
            userChoice = scanner.next().toUpperCase().trim();

            try {
                messageType = MessageType.valueOf(userChoice);
            } catch (IllegalArgumentException e) {
                System.out.println("Type de message inconnu");
                continue;
            }

            switch(messageType) {
                case A -> System.out.println("Message de type A");
                case B -> System.out.println("Message de type B");
                case C -> System.out.println("Message de type C");
                case D -> System.out.println("Message de type D");
            }

        }while (true);
//        }while (!userChoice.equals("A") && !userChoice.equals("B") && !userChoice.equals("C") && !userChoice.equals("D") );

        do {
            System.out.println("Veuillez attribuer un degrès d'importance à votre message ( HIGH // MEDIUM // LOW ) ");
            userChoicePriority = scanner.next().toUpperCase().trim();

            try {
                messagePriority = MessagePriority.valueOf(userChoicePriority);
            } catch (IllegalArgumentException e) {
                System.out.println("Type de message inconnu");
                userIsWrong = false;
                continue;
            }

            switch(messagePriority) {
                case HIGH -> System.out.println("Priorité de type HIGH");
                case MEDIUM -> System.out.println("Priorité de type MEDIUM");
                case LOW -> System.out.println("Priorité de type LOW");
            }
        }while(userIsWrong = true);

//        List<Message> messagesList = new ArrayList<>();
//        Message message = new Message(messageType, messagePriority);
         Message messagesOne = new Message (messageType, messagePriority);

    }
}
