// Nama File    : Anabul.java
// NIM          : 2406012313
// Nama         : Gabriel Prakosa Ardhi
// Tanggal      : 7 Mei

public class Anabul {
    private String panggilan; // Atribut panggilan 
    protected double bobot;

    public Anabul(String panggilan, double bobot) {
        this.panggilan = panggilan;
        this.bobot = bobot;
    }

    // Fungsi get dan set untuk nama panggilan
    public String getNama() { 
        return panggilan; 
    }

    public void setNama(String nama) { 
        this.panggilan = nama; 
    }

    public double getBobot() { 
        return bobot; 
    }
}
