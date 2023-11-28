package org.example.Library;

import java.util.ArrayList;

public class Library {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new PaperBook("Le pavillon des cancéreux","Soljenitsin", false, 450, "Plomb" ));
        books.add(new PaperBook("Les frères Karamasov","Dostoïevski", true, 800, "Ferosse" ));
        books.add(new PaperBook("La plaisanterie","Kundera", false, 259, "Poche" ));
        books.add(new PaperBook("L'arrache Coeur","Vian", false, 205, "Poche" ));
        books.add(new DigitalBook("Le pavillon des cancéreux","Soljenitsyne", false, FormatDigitalBook.PDF, 80 ));
        books.add(new DigitalBook("HellRaiser","Barker", false, FormatDigitalBook.WC3, 120 ));
        books.add(new PaperBook("La King Kong Théorie","Despentes", true,120, "Flamarion" ));
//        books.add(new PaperBook("Le pavillon des cancéreux","Soljenitsin", 450, "Plomb" ));
//        books.add(new PaperBook("Le pavillon des cancéreux","Soljenitsin", 450, "Plomb" ));
//        books.add(new PaperBook("Le pavillon des cancéreux","Soljenitsin", 450, "Plomb" ));
//        books.add(new PaperBook("Le pavillon des cancéreux","Soljenitsin", 450, "Plomb" ));

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Joice", "Lerond"));
        persons.add(new Person("Sarah", "Farance"));
        persons.add(new Person("Michaël", "Levieu"));
        persons.add(new Person("Charles", "Maurien"));


        System.out.println(books.get(5));

        books.remove(6);

        String getTitle = "L'arrache Coeur" ;
        String getAuthor = "Vian";

        for (Book b : books
             ) {
            if (getTitle.equals(b.getTitle())){
                System.out.println(b);
            }else{
                System.out.println(getTitle+" n'est pas dans la biblothèque");
            }

        }  for (Book b : books
             ) {
            if (getTitle.equals(b.getAuthor())){
                System.out.println(b);
            }else{
                System.out.println("La bibliothèque n'a pas de livre de "+getAuthor);
            }

            }
            //emprunter un livre
            Person borrower = persons.get(2);
        ArrayList<Borrow> borrowed = new ArrayList<>();
            for (Book b : books
                 ) {
                if (!b.isBorrowed){
                    Borrow borrow = new Borrow(borrower, "22-11-2023", "5-12-2023");
                    borrowed.add(borrow);
                    b.isBorrowed = true;
                    System.out.println("Vous avez emprunté "+b+"\n Veuillez le retourner avant le "+ borrow.getEndAt());

                }else{
                    System.out.println("Ce livre n'est pas disponnible");

                }

        }
    }

}
