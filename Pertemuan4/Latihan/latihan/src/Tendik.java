/**
 * Nama File    : Tendik.java
 * Deskripsi    : Subclass dari Pegawai untuk jenis Tenaga Kependidikan
 * Pembuat      : Djuan Setyo Jati / 24060124140163
 * Tanggal      : 12 Maret 2026
 */

import java.time.LocalDate;
import java.time.Period;

public class Tendik extends Pegawai {
    private String bidang;

    public Tendik(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String bidang) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        LocalDate currentDate = LocalDate.of(2025, 3, 10);
        
        Period masaKerja = Period.between(this.tmt, currentDate);
        
        LocalDate tanggalPensiun = tanggalLahir.plusYears(55).plusMonths(1).withDayOfMonth(1);
        double tunjangan = 0.01 * masaKerja.getYears() * gajiPokok;

        System.out.println("Jabatan\t\t\t: Tenaga Kependidikan");
        System.out.println("Bidang\t\t\t: " + bidang);
        System.out.println("Masa Kerja\t\t: " + masaKerja.getYears() + " tahun " + masaKerja.getMonths() + " bulan");
        System.out.println("Tanggal Pensiun\t\t: " + formatDate(tanggalPensiun));
        System.out.printf("Gaji Pokok\t\t: Rp %,.2f\n", gajiPokok);
        System.out.printf("Tunjangan\t\t: 1%% x %d x Rp %,.2f = Rp %,.2f\n", masaKerja.getYears(), gajiPokok, tunjangan);
        System.out.println("--------------------------------------------------");
    }
}