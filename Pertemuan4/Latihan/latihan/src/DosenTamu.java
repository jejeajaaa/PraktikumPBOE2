/**
 * Nama File    : DosenTamu.java
 * Deskripsi    : Subclass dari Dosen untuk jenis Dosen Tamu
 * Pembuat      : Djuan Setyo Jati / 24060124140163
 * Tanggal      : 12 Maret 2026
 */

import java.time.LocalDate;
import java.time.Period;

public class DosenTamu extends Dosen { 
    private String nidk;
    private LocalDate tanggalBerakhirKontrak;


    public DosenTamu(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas, String nidk, LocalDate tanggalBerakhirKontrak) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas); 
        this.nidk = nidk;
        this.tanggalBerakhirKontrak = tanggalBerakhirKontrak;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        LocalDate currentDate = LocalDate.of(2025, 3, 10);
        
        Period masaKerja = Period.between(this.tmt, currentDate);
        Period sisaKontrak = Period.between(currentDate, tanggalBerakhirKontrak);
        int totalBulanSisa = (sisaKontrak.getYears() * 12) + sisaKontrak.getMonths();
        double tunjangan = 0.025 * gajiPokok;

        System.out.println("NIDK\t\t\t: " + nidk);
        System.out.println("Jabatan\t\t\t: Dosen Tamu");
        System.out.println("Masa Kerja\t\t: " + masaKerja.getYears() + " tahun " + masaKerja.getMonths() + " bulan");
        System.out.println("Sisa Kontrak\t\t: " + totalBulanSisa + " bulan");
        System.out.printf("Gaji Pokok\t\t: Rp %,.2f\n", gajiPokok);
        System.out.printf("Tunjangan\t\t: 2.5%% x Rp %,.2f = Rp %,.2f\n", gajiPokok, tunjangan);
        System.out.println("--------------------------------------------------");
    }
}
