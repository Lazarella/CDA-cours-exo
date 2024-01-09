package exo.exo2.controller;

import exo.exo1.model.Produit;
import exo.exo2.Impl.ProduitDAOimpl;
import exo.exo2.services.ProduitDAOimpl;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class ShopAppConsole {
        private static ProduitDAOimpl produitDAO;

        public static void main() {
            StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
            SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();

            Session session = sessionFactory.openSession();

            Scanner scanner = new Scanner(System.in);

            int choice;
            do {
                System.out.println("#### Gestionnaire du magasin ####");
                System.out.println("1. Ajouter un nouveau produit");
                System.out.println("2. Afficher tous les produits");
                System.out.println("3. Modifier le stock d'un produit");
                System.out.println("4. Supprimer un produit");
                System.out.println("5. Faire un rechercher par prix");
                System.out.println("6. Faire un rechercher par période d'achat");
                System.out.println("7. Faire un rechercher par niveau de stock");
                System.out.println("8. Afficher la valeur du stock par marque");
                System.out.println("9. Afficher tous les produits d'une marque");
                System.out.println("10. Supprimer tous les produits d'une marque");
                System.out.println("11. Quitter l'application");
                System.out.println("Choix : ");

                choice = scanner.nextInt();
                scanner.nextLine(); // Consomme la nouvelle ligne

                switch (choice){
                    case 1 ->
                        addProduct(scanner);
                    case 2 ->
                        displayProduct();
                    case 3 ->
                        updateProduct(scanner);
                    case 4 ->
                        deleteProduct(scanner);
                    case 5 ->
                        findByPrice(scanner);
                    case 6 ->
                        findByDate(scanner);
                    case 7 ->
                            findByStockLevel(scanner);
                    case 8 ->
                            displayValueOfABrand(scanner);
                    case 9 ->
                            displayProductOfABrand(scanner);
                    case 10 ->
                            deleteProductByBrand(scanner);
                    case 11 ->
                        System.out.println("Bye");
                        sessionFactory.close();
                    default:
                        System.out.println("Choix invalide. Veuillez réessayer.");

                }

            }while (choice != 5);
        }

        private static void addProduct(Scanner scanner){
            System.out.println("Entrez la marque : ");
            String brand = scanner.nextLine();

            System.out.println("Entrez la reference produit : ");
            String reference = scanner.nextLine();

            System.out.println("Renseignez le prix d'un produit : ");
            double price = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Renseignez le nombre de produits de ce type : ");
            int stock = scanner.nextInt();
            scanner.nextLine();


            // Creation de la tache
            Produit produit = new Produit();
            produit.setMarque(brand);
            produit.setReference(reference);
            produit.setPrix(price);
            produit.setStock(stock);

            if(produitDAO.addProduit(produit)){
                System.out.println("Produit ajouté avec succès !");
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
                    System.out.println("###########");
                    System.out.println(task.getId() + ". " + task.getTitle() + " (" + (task.isCompleted() ? "Terminée" : "En cours") + ")");
                    System.out.println(task.getTaskInfo().toString());
                    System.out.println("###########");
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
    }

}
