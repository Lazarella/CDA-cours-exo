package org.example.exception;

public class Compte {
     private float solde;

    public Compte(float solde) {
        this.solde = solde;
    }

    public void retirer(float mt){
         solde = solde+mt;
     }
     public void retirer(float mt) throws MyException{
         if (mt>solde) throw new MyException("Solde Insuffisant");
         solde = solde-mt;
     }
     public float getSolde(){
         return solde;
     }

    public void setSolde(float solde) {
        this.solde = solde;
    }
}
