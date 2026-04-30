/* NIM  : 24060124140163
   Nama : Djuan Setyo jati
   Tgl  : 30 April 2026
*/

package POLIMORFISME_UNIVERSAL_INCLUSION.NO_4;

public class Dosen extends Civitasakademika {
    // Atribut
    private String nip;

    // Method
    public Dosen(String nama, String nip) {
        super(nama);
        this.nip = nip;
    }    

    public String getNip() {
        return nip;
    }

    @Override
    public String getNomor() {
        return nip;
    }
}
