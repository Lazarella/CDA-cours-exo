package org.example.poo.bancaire;

public class ComptePayant extends CompteAbstract {

    private final float TAX = 5/100;
    private double feeTax;
    public ComptePayant(double solde) {

        super(solde);
    }
public double moreMoney(double fee){
          feeTax = fee * getTAX();
         solde+= feeTax;
         return solde;
}
public double lessMoney(double fee){
    if((solde-fee)> 0 ) {
        solde -= fee;
    }else{
    feeTax = fee * getTAX();
    solde -= feeTax;}
    return solde;
}

    public float getTAX() {
        return TAX;
    }

    public double getFeeTax() {
        return feeTax;
    }

    public void setFeeTax(double feeTax) {
        this.feeTax = feeTax;
    }
}
