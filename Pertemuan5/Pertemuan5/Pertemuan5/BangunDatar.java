
/* Nama File    : BangunDatar.java
 * Deskripsi    : Membuat class BangunDatar sebagai parent dari Persegi dan Lingkaran
 * Pembuat      : Djuan Setyo Jati / 24060124140163
 * Tanggal      : Rabu, 25 Juni 2026
 */

public abstract class BangunDatar {
    // Atribut
    private int jmlSisi;
    private String warna;
    private String border;
    private static int counterBangunDatar = 0;

    //Method
    public BangunDatar() {
        this.jmlSisi = 0;
        this.warna = "";
        this.border = "";
        counterBangunDatar++;
    }

    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    public int getJmlSisi() {
        return this.jmlSisi;
    }

    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    public String getWarna() {
        return this.warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getBorder() {
        return this.border;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    public void printInfo() {
        System.out.println("Jumlah sisi: " + this.jmlSisi);
        System.out.println("Warna: " + this.warna);
        System.out.println("Border: " + this.border);
        
    }

    public static void printCounterBangunDatar() {
        System.out.println("Jumlah Objek Bangun Datar: " + counterBangunDatar);
    }

    public abstract double getLuas(); 
    public abstract double getKeliling(); 

    public boolean isEqualLuas(BangunDatar X){
        return this.getLuas() == X.getLuas();
    }
}
