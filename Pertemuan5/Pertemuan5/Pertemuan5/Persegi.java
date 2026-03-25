/* Nama File    : Persegi.java
 * Deskripsi    : Membuat class persegi dengan inherit BangunDatar
 * Pembuat      : Djuan Setyo Jati / 24060124140163
 * Tanggal      : Rabu, 25 Juni 2026
 */

public class Persegi extends BangunDatar implements IResize {
    // Atribut
    private double sisi;

    //Method
    public Persegi() {
        this.sisi = 0;
    }

    public Persegi(double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
    }

    public void setPersegi(double sisi, String warna, String border) {
        this.sisi = sisi;
        this.setWarna(warna);
        this.setBorder(border);
        this.setJmlSisi(4);
    }

    public double getSisi() {
        return this.sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getLuas(){
        return this.sisi * this.sisi;
    }

    public double getKeliling(){
        return 4 * this.sisi;
    }

    public double getDiagonal(){
        return Math.sqrt(this.sisi*this.sisi + this.sisi*this.sisi);
    }

    @Override
    public void printInfo() {
        System.out.println("Jumlah sisi: " + getJmlSisi());
        System.out.println("Warna: " + getWarna());
        System.out.println("Border: " + getBorder());
        System.out.println("Sisi: " + sisi);
    }

    @Override
    public void zoomIn() {
        this.sisi = this.sisi * 1.1;
    }

    @Override
    public void zoomOut() {
        this.sisi = this.sisi * 0.9;
    }

    @Override
    public void zoom(int percent) {
        this.sisi = this.sisi * (percent / 100.0);
    }
}