package org.example.controller;

import org.example.impl.TaskDAOImpl;
import org.example.model.Task;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.Date;
import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class ToDoListAppConsole {

    private static EntityManagerFactory entityManagerFactory;
    private static TaskDAOImpl taskDAO;

    public static void main() {
        entityManagerFactory = Persistence.createEntityManagerFactory("jpa_exo");
        taskDAO = new TaskDAOImpl(entityManagerFactory);

        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("#### To Do List ####");
            System.out.println("1. Ajouter une tâche à la liste");
            System.out.println("2. Afficher toutes les tâches de la liste");
            System.out.println("3. Marquer une tâche comme terminée");
            System.out.println("4. Supprimer une tâche de la liste");
            System.out.println("5. Quitter l'application");
            System.out.println("Choix : ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consomme la nouvelle ligne

            switch (choice){
                case 1:
                    addTask(scanner);
                    break;
                case 2:
                    displayTasks();
                    break;
                case 3:
                    markTaskAsCompleted(scanner);
                    break;
                case 4:
                    deleteTask(scanner);
                    break;
                case 5 :
                    handleTaskInfoMenu(scanner);
                    break;
                case 6:
                    System.out.println("Bye");
                    entityManagerFactory.close();
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");

            }

        }while (choice != 5);
    }
    private static void handleTaskInfoMenu(Scanner scanner) {
        int taskInfoChoice;
        do {
            System.out.println("#### Informations sur la tâche ####");
            System.out.println("1. Ajouter des informations sur une tâche");
            System.out.println("2. Indiquer l'échéance");
            System.out.println("3. Indiquer le niveau de priorité");
            System.out.println("4. Retour au menu principal");
            System.out.println("Choix : ");

            taskInfoChoice = scanner.nextInt();
            scanner.nextLine(); // Consomme la nouvelle ligne

            switch (taskInfoChoice){
                case 1:
                    addTaskInfo(scanner);
                    break;

                case 2:
                    addDate(scanner);
                    break;
                case 3:
                    addPriority(scanner);

                case 4:
                    System.out.println("Retour au menu principal");
                    break;

                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");

            }

        } while (taskInfoChoice != 3);
    }


    private static void addTask(Scanner scanner){
        System.out.println("Entrer le titre de la tâche : ");
        String title = scanner.nextLine();

        Task task = new Task();
        task.setTitle(title);
        task.setCompleted(false);

        if(taskDAO.addTask(task)){
            System.out.println("Tâche ajoutée avec succès !");
        }else {
            System.out.println("Erreur");
        }
    }

    private static void displayTasks() {
        List<Task> tasks = taskDAO.getAllTasks();

        if (tasks.isEmpty()) {
            System.out.println("Aucune tâche trouvée.");
        } else {
            System.out.println("=== Liste des tâches ===");
            for (Task task : tasks) {
                System.out.println(task.getId() + ". " + task.getTitle() + " (" + (task.isCompleted() ? "Terminée" : "En cours") + ")");
            }
        }
    }

    private static void deleteTask(Scanner scanner){
        System.out.println("Entrez l'ID de la tâche à supprimer : ");
        Long taskId  = scanner.nextLong();
        scanner.nextLine();

        if (taskDAO.deleteTask(taskId)){
            System.out.println("Suppression OK");
        }else {
            System.out.println("Erreur");
        }
    }

    private static void markTaskAsCompleted(Scanner scanner){
        System.out.println("Entrez l'ID de la tâche à supprimer : ");
        Long taskId  = scanner.nextLong();
        scanner.nextLine();

        if (taskDAO.markTaskAsCompleted(taskId)){
            System.out.println("Modification OK");
        }else {
            System.out.println("Erreur");
        }
    }
    private static void addTaskInfo(Scanner scanner){
        System.out.println("Entrez la description de la tâche à réaliser ");
        String description = scanner.nextLine();
        System.out.println("Entrez l'échéance");
        Date dueDate = Date.valueOf(scanner.next());
        System.out.println("Veuillez renseigner une priorité : \n• Aucune \n• Moyenne\n• Urgent\n• Defcon 5");
    }
    private static void addDate(Scanner scanner){

    }
    private static void addPriority(Scanner scanner){

    }
}