package org.example.poo.heritage;

public class Appartement extends House {

    protected final int FLAT_SURFACE = 50;
    protected final String FLAT_NAME ="un appartement";

    public Appartement() {
        super();

    }
    public void display (){
        System.out.println("Je suis "+FLAT_NAME+", ma surface est de " + FLAT_SURFACE+" m² !");
    }
}
