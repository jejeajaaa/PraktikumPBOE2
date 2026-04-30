/* NIM  : 24060123130094
   Nama : Gabriel Prakosa Ardhi
   Tgl  : 24 April 2026
*/
package POLIMORFISME_UNIVERSAL_INCLUSION.NO_3;

public abstract class Anabul {
    // Atribut
    private String nama;

    // Method
    public Anabul(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public abstract void gerak();

    public abstract void bersuara();
}
