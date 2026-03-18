/**
 * Nama File    : DosenTetap.java
 * Deskripsi    : Subclass dari Dosen untuk jenis Dosen Tetap
 * Pembuat      : Djuan Setyo Jati / 24060124140163
 * Tanggal      : 12 Maret 2026
 */

import java.time.LocalDate;
import java.time.Period; 

public class DosenTetap extends Dosen {
    private String nidn;

    public DosenTetap(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas, String nidn) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        
        LocalDate currentDate = LocalDate.of(2025, 3, 10); 
        
        Period masaKerja = Period.between(this.tmt, currentDate); 
        
        LocalDate tanggalPensiun = tanggalLahir.plusYears(65).plusMonths(1).withDayOfMonth(1);
        double tunjangan = 0.02 * masaKerja.getYears() * gajiPokok;

        System.out.println("NIDN\t\t\t: " + nidn);
        System.out.println("Jabatan\t\t\t: Dosen Tetap");
        System.out.println("Masa Kerja\t\t: " + masaKerja.getYears() + " tahun " + masaKerja.getMonths() + " bulan");
        System.out.println("Tanggal Pensiun\t\t: " + formatDate(tanggalPensiun));
        System.out.printf("Gaji Pokok\t\t: Rp %,.2f\n", gajiPokok);
        System.out.printf("Tunjangan\t\t: 2%% x %d x Rp %,.2f = Rp %,.2f\n", masaKerja.getYears(), gajiPokok, tunjangan);
        System.out.println("--------------------------------------------------");
    }
}

