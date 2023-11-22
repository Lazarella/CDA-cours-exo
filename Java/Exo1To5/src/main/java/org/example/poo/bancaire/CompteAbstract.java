package org.example.poo.bancaire;

public abstract class CompteAbstract {
    protected int code;
    protected double solde;
    public static int counter;

    {
        counter ++;
    }

    public CompteAbstract( double solde) {
        this.code = counter;
        this.solde = solde;
    }
    public double moreMoney(double fee){
        solde += fee;
        return solde;
    }

    public double lessMoney(double fee){
        if((solde-fee)> 0 ) {
            solde -= fee;
        }else{
            System.out.println("Vous n'avait pas assez d'argent pour effectuer un retrait");
        }
        return solde;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    @Override
    public String toString() {
        return "CompteAbstract{" +
                "code=" + code +
                ", solde=" + solde +
                '}';
    }
}
