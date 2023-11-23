package org.example.poo.bancaire;

public class CompteEpargne extends CompteAbstract{

    protected final float INTEREST_RATE = 1.4f;
    public CompteEpargne(double solde) {

        super(solde);
        this.solde = solde;
    }
    public double calculInterestRate(){
        solde *= (INTEREST_RATE/100);
        return solde;
    }
}
