
/* Nama File    : Lingkaran.java
 * Deskripsi    : Membuat class Lingkaran dengan inherit BangunDatar dan implement IResize
 * Pembuat      : Djuan Setyo Jati / 24060124140163
 * Tanggal      : Rabu, 25 Juni 2026
 */

public class Lingkaran extends BangunDatar implements IResize {
    private double jari;
    // Atribut
    public Lingkaran(){
        this.jari = 0;
    }

    // Method
    public Lingkaran(double diameter, String Warna, String warna, String border){
        this.jari = diameter / 2;
        this.setWarna(Warna);
        this.setBorder(border);
        this.setJmlSisi(1);
    }

    public double getJari(){
        return this.jari;
    }

    public void setJari(double jari){
        this.jari = jari;
    }

    public double getLuas(){
        return Math.PI * (this.jari * this.jari);
    }

    public double getKeliling(){
        return 2 * Math.PI * this.jari;
    }

    public double Diagonal(){
        return 2 * this.jari;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Jari-jari : " + jari);
    }

    @Override
    public void zoomIn() {
        this.jari = this.jari * 1.1;
    }

    @Override
    public void zoomOut() {
        this.jari = this.jari * 0.9;
    }

    @Override
    public void zoom(int percent) {
        this.jari = this.jari * (percent / 100.0);
    }
}
