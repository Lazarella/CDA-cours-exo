package org.example.paper_shop;

public class Pack extends Item{
    private Item item;
    private String infos;
    private int quantity;
    private int deal = setDeal();
    private double fullPrice = setFullPrice();

    public Pack(String name, double price, Item item, String infos, int quantity, int deal, double fullPrice) {
        super(name, price);
        this.item = item;
        this.infos = infos;
        this.quantity = quantity;
        this.deal = deal;
        this.fullPrice = fullPrice;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String getInfos() {
        return infos;
    }

    public void setInfos(String infos) {
        this.infos = infos;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getDeal() {
        return deal;
    }

    public double getFullPrice() {
        return fullPrice;
    }
    public int setDeal (){
        if(getQuantity()>= 30){
            deal = 15;

        } else if (getQuantity()>= 20) {
            deal = 10;
        }else if(getQuantity()>=10) {
            deal = 5;
        }else{
            deal = 0;
        }
        return deal;
    }
    public double setFullPrice(){
        fullPrice = (item.getPrice() * getQuantity())*getDeal();
        return fullPrice;
    }
}
