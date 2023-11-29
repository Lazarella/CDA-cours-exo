package org.example.paper_shop;

public class Bill {
    private String client;
    private Line[] lines = new Line[10];
    private String date;
    private double total = setTotal();


    public Bill(String client, Line[] lines, String date) {
        this.client = client;
        setLine(lines);
        this.date = date;
        this.total = calculateTotal();
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public Line[] getLine() {
        return lines;
    }

    public void setLine(Line[] line) {
        if(lines.length <= 10){
            this.lines = lines;
        }else{
            System.out.println("Vous ne pouvez pas ajouter autant de lignes dans votre facture");
        }
    }

    private double calculateTotal() {
        double total = 0;
        for (Line line : this.lines) {
            if (line != null) {
                total += line.getFullPrice();
            }
        }
        return total;
    }
    public double setTotal(){

        return total;
    }


}
