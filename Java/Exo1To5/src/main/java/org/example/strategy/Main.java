package org.example.strategy;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Destination destination = new Destination.DestinationBuilder().destination("Jakarta").build();

        String choice;
        do {
            System.out.println("1 -- Economic");
            System.out.println("2 -- OffRoad");
            System.out.println("3 -- Road");
            choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    destination.navigate(new EconomicStrategy());
                    break;case "2":
                    destination.navigate(new OffRoadStrategy());
                    break;case "3":
                    destination.navigate(new RoadStrategy());
                    break;
            }
        }while (!choice.equals("0"));
    }
}

