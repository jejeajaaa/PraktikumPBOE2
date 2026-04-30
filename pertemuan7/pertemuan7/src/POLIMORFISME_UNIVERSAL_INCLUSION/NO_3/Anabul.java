/* NIM  : 24060124140163
   Nama : Djuan Setyo jati
   Tgl  : 30 April 2026
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
