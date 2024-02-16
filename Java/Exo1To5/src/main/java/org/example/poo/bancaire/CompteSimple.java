package org.example.poo.bancaire;

public class CompteSimple extends CompteAbstract{

    protected double decouvert ;
    public CompteSimple(double solde, double decouvert) {
        super(solde);
        this.solde = solde;
        this.decouvert = decouvert;
    }
    public double lessMoney(double fee){
        if ((solde-fee)>= decouvert){
            solde -= fee;
        }else{
            System.out.println("Vous n'avez pas assez d'argent pour effectuer un retrait");
        }
        return solde;
    }
}

