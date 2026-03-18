import java.time.LocalDate;

public class MainPegawai { 
    public static void main(String[] args) {
        
        System.out.println("===== DOSEN TETAP =====");
        // Parameter: nip, nama, tanggalLahir, tmt, gajiPokok, fakultas, nidn
        DosenTetap dosenTetap = new DosenTetap(
                "9545647548", 
                "Andi", 
                LocalDate.of(1990, 5, 5), 
                LocalDate.of(2015, 1, 1), 
                5000000, 
                "Fakultas Sains dan Matematika", 
                "78647324"
        );
        dosenTetap.printInfo();

        System.out.println("\n===== DOSEN TAMU =====");
        // Parameter: nip, nama, tanggalLahir, tmt, gajiPokok, fakultas, nidk, tanggalBerakhirKontrak
        DosenTamu dosenTamu = new DosenTamu(
                "87654321", 
                "Budi", 
                LocalDate.of(1985, 3, 10), 
                LocalDate.of(2022, 2, 1), 
                4500000, 
                "Fakultas Teknik", 
                "12345678", 
                LocalDate.of(2026, 12, 31)
        );
        dosenTamu.printInfo();

        System.out.println("\n===== TENDIK =====");
        // Parameter: nip, nama, tanggalLahir, tmt, gajiPokok, bidang
        Tendik tendik = new Tendik(
                "11223344", 
                "Citra", 
                LocalDate.of(1992, 7, 15), 
                LocalDate.of(2018, 4, 1), 
                4000000, 
                "Akademik"
        );
        tendik.printInfo();
    }
}