/* NIM  : 24060123130094
   Nama : Gabriel Prakosa Ardhi
   Tgl  : 24 April 2026
*/

package POLIMORFISME_UNIVERSAL_INCLUSION.NO_4;

public class Seminar {
    private static final int kapasitas = 100;
    private Civitasakademika[] peserta;
    private int jumlahPeserta;

    public Seminar() {
        peserta = new Civitasakademika[kapasitas];
        jumlahPeserta = 0;
    }

    public int countPeserta() {
        return jumlahPeserta;
    }

    public void registrasi(Civitasakademika peserta) {
        if (jumlahPeserta < kapasitas) {
            this.peserta[jumlahPeserta] = peserta;
            jumlahPeserta++;
        }
    }

    public void tampilPeserta() {
        for (int i = 0; i < jumlahPeserta; i++) {
            System.out.println((i + 1) + ". " + peserta[i].getNama() + " - " + peserta[i].getNomor());
        }
    }

    public int countMahasiswa() {
        int count = 0;
        for (int i = 0; i < jumlahPeserta; i++) {
            if (peserta[i] instanceof Mahasiswa) {
                count++;
            }
        }
        return count;
    }

    public int countDosen() {
        int count = 0;
        for (int i = 0; i < jumlahPeserta; i++) {
            if (peserta[i] instanceof Dosen) {
                count++;
            }
        }
        return count;
    }
}
