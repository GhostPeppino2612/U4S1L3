package Esercizio2;

public class SIM {
    private int numTel;
    private double credito;
    private UltimeChiamate ultimeChiamate;

    public SIM(int numTel, UltimeChiamate ultimeChiamate) {
        this.numTel = numTel;
        this.credito = 0;
        this.ultimeChiamate = ultimeChiamate;
    }

    public int getNumTel() {
        return numTel;
    }

    public void setNumTel(int numTel) {
        this.numTel = numTel;
    }

    public UltimeChiamate getUltimeChiamate() {
        return ultimeChiamate;
    }

    public void setUltimeChiamate(UltimeChiamate ultimeChiamate) {
        this.ultimeChiamate = ultimeChiamate;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
    public void risultato() {

    }
}
