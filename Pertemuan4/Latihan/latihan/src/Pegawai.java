/**
 * Nama File    : Pegawai.java
 * Deskripsi    : Superclass yang merepresentasikan entitas dasar pegawai
 * Pembuat      : Djuan Setyo Jati / 24060124140163
 * Tanggal      : 12 Maret 2026
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pegawai {
    protected String nip;
    protected String nama;
    protected LocalDate tanggalLahir;
    protected LocalDate tmt;
    protected double gajiPokok;

    public Pegawai(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    public String formatDate(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy");
        return date.format(formatter);
    }

    public void printInfo() {
        System.out.println("NIP\t\t\t: " + nip);
        System.out.println("Nama\t\t\t: " + nama);
        System.out.println("Tanggal Lahir\t\t: " + formatDate(tanggalLahir));
        System.out.println("TMT\t\t\t: " + formatDate(tmt));
    }
}