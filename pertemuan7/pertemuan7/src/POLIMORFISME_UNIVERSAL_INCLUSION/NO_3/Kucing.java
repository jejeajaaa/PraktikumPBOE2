/* NIM  : 24060124140163
   Nama : Djuan Setyo jati
   Tgl  : 30 April 2026
*/

package POLIMORFISME_UNIVERSAL_INCLUSION.NO_3;

public class Kucing extends Anabul {
    private String warnaRambut;

    public Kucing(String nama, String warnaRambut) {
        super(nama);
        this.warnaRambut = warnaRambut;
    }

    public String getWarnaRambut() {
        return warnaRambut;
    }

    @Override
    public void gerak() {
        System.out.println(getNama() + " bergerak dengan cara: Berjalan");
    }

    @Override
    public void bersuara() {
        System.out.println(getNama() + " bersuara: Meow");
    }
}
