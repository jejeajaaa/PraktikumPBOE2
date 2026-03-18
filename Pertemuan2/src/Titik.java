/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Djuan Setyo Jati - 24060124140163
 * Tanggal      : 27 Februari 2025
 */

public class Titik {
    /***************ATRIBUT***************/
    private double absis;
    private double ordinat;

    /***************METHOD***************/
    public Titik() {
        absis = 0;
        ordinat = 0;
    }

    public Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
    }

    public double getAbsis() {
        return absis;
    }

    public double getOrdinat() {
        return ordinat;
    }

    public void setAbsis(double x) {
        absis = x;
    }

    public void setOrdinat(double y) {
        ordinat = y;
    }

    public void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y; 
    }

    public double getJarak(Titik t) {
        double dx = this.absis - t.getAbsis();
        double dy = this.ordinat - t.getOrdinat();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public void printTitik() {
        System.out.print("(" + absis + ", " + ordinat + ")");
    }
}