/* Nama File    : AngkaSialException.java
 * Deskripsi    : Eksepsi buatan sendiri, menolak masukan angka 13!
 * Pembuat      : Djuan Setyo Jati - 24060124140163
 * Tanggal      : Kamis, 26 Maret 2026
 */

public class AngkaSialException extends Exception {
    public AngkaSialException() {
        super("jangan memasukkan angka 13 karena angka sial !!!");
    }
}