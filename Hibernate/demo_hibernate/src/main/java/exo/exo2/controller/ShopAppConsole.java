package exo.exo2.controller;

import exo.exo1.model.Comment;
import exo.exo1.model.Picture;
import exo.exo1.model.Produit;
//import exo.exo2.Impl.ProduitDAOimpl;
import exo.exo2.services.CommentService;
import exo.exo2.services.PictureService;
import exo.exo2.services.ProduitDAOimpl;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.SQLOutput;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class ShopAppConsole {
    private static ProduitDAOimpl produitDAO;
    private static PictureService pictureService;
    private static CommentService commentService;

    public static void main(String[] args) {
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();

        Session session = sessionFactory.openSession();

        produitDAO = new ProduitDAOimpl(sessionFactory);

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
            System.out.println("9. Afficher tou1s les produits d'une marque");
            System.out.println("10. Supprimer tous les produits d'une marque");
            System.out.println("11. Quitter l'application");
            System.out.println("Choix : ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consomme la nouvelle ligne

            switch (choice) {
                case 1 -> addProduct(scanner);
                case 2 -> displayProduct();
                case 3 -> updateProduct(scanner);
                case 4 -> deleteProduct(scanner);
                case 5 -> findByPrice(scanner);
                case 6 -> findByDate(scanner);
                case 7 -> findByStockLevel(scanner);
                case 8 -> displayValueOfABrand(scanner);
                case 9 -> displayProductOfABrand(scanner);
                case 10 -> deleteProductByBrand(scanner);
                case 11 -> {
                    System.out.println("Bye");
                    sessionFactory.close();
                }
                default -> System.out.println("Choix invalide. Veuillez réessayer.");
            }

        } while (choice != 10);
    }

    private static void addProduct(Scanner scanner) {
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


        Produit produit = new Produit();
        produit.setMarque(brand);
        produit.setReference(reference);
        produit.setPrix(price);
        produit.setStock(stock);

        List<Picture> pictures = new ArrayList<>();
        while (true) {
            Picture picture = addPicture(scanner);

            if (picture != null) {
                pictures.add(picture);
            } else {
                break;
            }
        }

        produit.setPictures(pictures);


        if (produitDAO.addProduit(produit)) {
            System.out.println("Produit ajouté avec succès !");
        } else {
            System.out.println("Erreur");
        }
    }


        private static Picture addPicture(Scanner scanner) {
            Picture picture = new Picture();

            do {
                try {
                    System.out.println("Ajouter une image?\n1- Oui\n2- Non");
                    int choice = scanner.nextInt();
                    scanner.nextLine();

                    if (choice == 1) {
                        System.out.println("Veuillez entrer l'adresse URL de l'image");
                        String pictureURL = scanner.nextLine().trim();
                        picture.setUrl(pictureURL);
                        return picture;
                    } else if (choice == 2) {
                        break;
                    } else {
                        System.out.println("Je n'ai pas compris votre réponse");
                    }
                }catch (InputMismatchException e){
                    System.out.println("Entrée incorrecte. Veuillez entrer un nombre entier (1 ou 2).");
                }
            } while (true);

            return null;
        }
    private static Comment addComment(Scanner scanner) {
        Comment comment = new Comment();

        do {
            try {
                System.out.println("Ajouter un commantaire sur le produit?\n1- Oui\n2- Non");
                int choice = scanner.nextInt();
                scanner.nextLine();

                if (choice == 1) {
                    System.out.println("Veuillez votre commantaire (255 charactères maximum)");
                    String commentContent = scanner.nextLine().trim();
                    scanner.nextLine();
                    comment.setContent(commentContent);
                    System.out.println("Attribuer une note (0-4 ");
                    int commentRate = scanner.nextInt();
                    comment.setRate(commentRate);
                    return comment;
                } else if (choice == 2) {
                    break;
                } else {
                    System.out.println("Je n'ai pas compris votre réponse");
                }
            }catch (InputMismatchException e){
                System.out.println("Entrée incorrecte. Veuillez entrer un nombre entier!");
            }
        } while (true);

        return null;
    }

        private static void displayProduct() {
            List<Produit> produits = produitDAO.getAllProduit();

            if (produits == null) {
                System.out.println("Aucune tâche trouvée.");
            } else {
                System.out.println("=== Liste des produits en stocks ===");
                for (Produit p : produits) {
                    System.out.println("###########");
                    System.out.println(p.getReference() + " . " + p.getMarque() + " . " + p.getStock() +"\n");
                    System.out.println("###########");
                }
            }
        }

        private static void deleteProduct(Scanner scanner){
            System.out.println("Entrez l'ID du produit à supprimer : ");
            Long productId  = scanner.nextLong();
            scanner.nextLine();

            if (produitDAO.deleteProduit(productId)){
                System.out.println("Suppression OK");
            }else {
                System.out.println("Erreur");
            }
        }

        private static void updateProduct(Scanner scanner){
            System.out.println("Entrez l'ID du produit à supprimer : ");
            Long productId  = scanner.nextLong();
            scanner.nextLine();

            System.out.println("Renseignez le stock");
            int newStock = scanner.nextInt();
            scanner.nextLine();

            if (produitDAO.updateProduit(productId, newStock)){
                System.out.println("Suppression OK");
            }else {
                System.out.println("Erreur");
            }
        }

        private static void findByPrice(Scanner scanner) {
            System.out.println("Veuillez entrer un prix et le gestionnaire affichera tous les produits ayant une valeur supérieure");
            Double entryPrice = scanner.nextDouble();
            scanner.nextLine();

            List<Produit> produitsByPrice = produitDAO.getProduitPriceFilter(entryPrice);

            if (produitsByPrice == null) {
                System.out.println("Aucune tâche trouvée.");
            } else {
                System.out.println("=== Liste des produits valant plus de " + entryPrice + " ===");
                for (Produit p : produitsByPrice) {
                    System.out.println("###########");
                    System.out.println(p.getReference() + " . " + p.getMarque() + " . " + p.getStock() + "\n");
                    System.out.println("###########");
                }
            }
        }
        private static void findByDate(Scanner scanner) {
            DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            sdf.setLenient(false);
            System.out.println("Veuillez entrez la date marquant le début de la période (DD/MM/YYYY)");
            String dateMinStr = scanner.next();
            scanner.nextLine();
            Date dateMin = null;
            try {
                dateMin = sdf.parse(dateMinStr);
                System.out.println("Date de début " + sdf.format(dateMin));
            } catch (ParseException e) {
                System.out.println("Format de date invalide. Veuillez entrer une date au format MM/DD/YYYY.");
            }

            DateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
            sdf2.setLenient(false);
            System.out.println("Veuillez entrez la date marquant la fin de la période (DD/MM/YYYY)");
            String dateMaxStr = scanner.next();
            scanner.nextLine();
            Date dateMax = null;
            try {
                dateMax = sdf2.parse(dateMaxStr);
                System.out.println("Date de fin " + sdf.format(dateMax));
            } catch (ParseException e) {
                System.out.println("Format de date invalide. Veuillez entrer une date au format MM/DD/YYYY.");
            }

            if (dateMax.before(dateMin)){
                System.out.println("La date de fin ne peut pas être antérieure à la date de début.");
                return;
            }

            List<Produit> produits = produitDAO.getProduitDateFilter(dateMin, dateMax);

            if (produits == null) {
                System.out.println("Aucune tâche trouvée.");
            } else {
                for (Produit p : produits
                ) {
                    System.out.println("###########");
                    System.out.println(p.getReference() + " . " + p.getMarque() + " . " + p.getStock() + "\n");
                    System.out.println("###########");
                }
            }
        }
        private static void findByStockLevel(Scanner scanner){

        }
        private static void displayValueOfABrand(Scanner scanner){

        }
        private static void displayProductOfABrand(Scanner scanner){

        }
        private static void deleteProductByBrand(Scanner scanner){

        }
    }


