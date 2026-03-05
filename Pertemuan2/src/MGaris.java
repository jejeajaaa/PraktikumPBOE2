/* Nama File    : MTitik.java
 * Deskripsi    : Main class untuk menguji class Titik
 * Pembuat      : Djuan Setyo Jati (24060124140163)
 * Tanggal      : 27 Februari 2025
 */

public class MGaris {
    public static void main(String[] args) {
        Titik t1 = new Titik(-2, 0);
        Titik t2 = new Titik(0, 4);
        Garis G1 = new Garis(t1, t2);

        System.out.println("Panjang Garis: " + G1.getPanjang());
        System.out.println("Gradien Garis: " + G1.getGradien());
        System.out.println("Persamaan Garis: " + G1.getPersamaanGaris());
    }
}