/* NIM  : 24060123130094
   Nama : Gabriel Prakosa Ardhi
   Tgl  : 24 April 2026
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
