package Esercizio1;

import java.awt.*;

public class Rettangolo {
    private double base;
    private double altezza;
    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    public double calcolaPerimetro() {
        return 2 * (altezza + base);
    }

    public double calcolaArea() {
        return altezza * base;
    }
    public void stampaRettangolo() {
        System.out.println("Altezza: " + altezza);
        System.out.println("Larghezza: " + base);
        System.out.println("Perimetro: " + calcolaPerimetro());
        System.out.println("Area: " + calcolaArea());
    }

    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
        System.out.println("Rettangolo 1:");
        r1.stampaRettangolo();
        System.out.println("\nRettangolo 2:");
        r2.stampaRettangolo();

        double sommaAree = r1.calcolaArea() + r2.calcolaArea();
        double sommaPerimetri = r1.calcolaPerimetro() + r2.calcolaPerimetro();
        System.out.println("\nSomma delle aree: " + sommaAree);
        System.out.println("Somma dei perimetri: " + sommaPerimetri);
    }

}
