/* NIM  : 24060124140163
   Nama : Djuan Setyo jati
   Tgl  : 30 April 2026
*/

package POLIMORFISME_UNIVERSAL_INCLUSION.NO_3;

public class Anjing extends Anabul {
    // Atribut
    private String ras;

    // Method
    public Anjing(String nama, String ras) {
        super(nama);
        this.ras = ras;
    }

    public String getRas() {
        return ras;
    }

    @Override
    public void gerak() {
        System.out.println(getNama() + " bergerak dengan cara: Berjalan");
    }

    @Override
    public void bersuara() {
        System.out.println(getNama() + " bersuara: Guk Guk");
    }
}
