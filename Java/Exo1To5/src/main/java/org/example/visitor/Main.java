package org.example.visitor;

public class Main {
    public static void main(String[] args) {
        Manager manager1 = new Manager(1, "Jean-Jean", 4800d, "Bien");
        manager1.accept(new UpdatePerformanceReview());

        Developer developer1 = new Developer(11, "Sarah Rouhi", 4800d, "Très bien!");
        developer1.accept(new UpdateSalary()); 

    }
}
