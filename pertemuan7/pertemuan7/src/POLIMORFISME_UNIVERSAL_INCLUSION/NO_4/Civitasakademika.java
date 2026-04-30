/* NIM  : 24060123130094
   Nama : Gabriel Prakosa Ardhi
   Tgl  : 24 April 2026
*/

package POLIMORFISME_UNIVERSAL_INCLUSION.NO_4;

public abstract class Civitasakademika {
    protected String nama;    

    public Civitasakademika(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public abstract String getNomor();
}
