/**
 * Nama File    : Dosen.java
 * Deskripsi    : Subclass dari Pegawai dan Superclass untuk jenis Dosen
 * Pembuat      : Djuan Setyo Jati / 24060124140163
 * Tanggal      : 12 Maret 2026
 */

import java.time.LocalDate;

public class Dosen extends Pegawai {
    protected String fakultas;

    public Dosen(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Fakultas\t\t: " + fakultas);
    }
}
