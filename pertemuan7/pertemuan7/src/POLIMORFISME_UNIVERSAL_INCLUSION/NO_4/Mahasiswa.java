/* NIM  : 24060124140163
   Nama : Djuan Setyo jati
   Tgl  : 30 April 2026
*/


package POLIMORFISME_UNIVERSAL_INCLUSION.NO_4;

public class Mahasiswa extends Civitasakademika {
    // Atribut
    private String nim;

    // Method
    public Mahasiswa(String nama, String nim) {
        super(nama);
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    @Override
    public String getNomor() {
        return nim;
    }
}
