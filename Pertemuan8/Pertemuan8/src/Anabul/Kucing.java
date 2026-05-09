package Anabul;

// Nama File    : Kucing.java
// NIM          : 2406012313
// Nama         : Gabriel Prakosa Ardhi

public class Kucing extends Anabul {
    protected double bobot;

    public Kucing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }

    public double getBobot() { 
        return bobot; 
    }
}
