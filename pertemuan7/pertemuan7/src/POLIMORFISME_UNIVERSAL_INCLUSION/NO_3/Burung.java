/* NIM  : 24060124140163
   Nama : Djuan Setyo jati
   Tgl  : 30 April 2026
*/

package POLIMORFISME_UNIVERSAL_INCLUSION.NO_3;

public class Burung extends Anabul {
    // Atribut
    private String warnaBulu;

    // Method
    public Burung(String nama, String warnaBulu) {
        super(nama);
        this.warnaBulu = warnaBulu;
    }

    public String getWarnaBulu() {
        return warnaBulu;
    }

    @Override
    public void gerak() {
        System.out.println(getNama() + " bergerak dengan cara: Terbang");
    }

    @Override
    public void bersuara() {
        System.out.println(getNama() + " bersuara: Cuit Cuit");
    }
}
