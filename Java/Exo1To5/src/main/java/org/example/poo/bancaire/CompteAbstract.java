package org.example.poo.bancaire;

abstract class CompteAbstract {
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
    public double moreMoney(int fee){
        solde += fee;
        return solde;
    }

    public double lessMoney(int fee){
        solde -= fee;
        return solde;
    }

    @Override
    public String toString() {
        return "CompteAbstract{" +
                "code=" + code +
                ", solde=" + solde +
                '}';
    }
}
