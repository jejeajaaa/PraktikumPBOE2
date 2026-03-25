/* Nama File    : MManusia.java
 * Deskripsi    : Membuat class Main untuk menguji class Pengusaha dan Pekerja
 * Pembuat      : Djuan Setyo Jati / 24060124140163
 * Tanggal      : Rabu, 25 Juni 2026
 */

import java.time.LocalDate;

public class MManusia {
    public static void main(String[] args) {

        PNS p1 = new PNS("Satriyo", LocalDate.of(2006, 4, 1), "Jl. Seroja", 15000000, "198302032006041002");
        Pengusaha pe1 = new Pengusaha("Adhy", LocalDate.of(2000, 1, 1), "Jl. Air", 55000000, "000-556-773-212-000-5");
        Petani pt1 = new Petani("Nugraha", LocalDate.of(1977, 1, 9), "Jl. Bunga 9 Tembalang", 5000000, "Wonogiri");
        PNS p2 = new PNS("Panji", LocalDate.of(2010, 4, 1), "Jl. Melati", 10000000, "198004212010041002");

        p2.setAlamat("Jl. Panorama 111 Tembalang");

        System.out.println("===== JUMLAH DATA =====");
        System.out.println("Jumlah Manusia = " + Manusia.getCounterMns());
        System.out.println("Jumlah PNS = " + PNS.getCounterPNS());
        System.out.println("Jumlah Pengusaha = " + Pengusaha.getCounterPengusaha());
        System.out.println("Jumlah Petani = " + Petani.getCounterPetani());

        System.out.println("\n===== PAJAK =====");
        System.out.println("Pajak PNS p1 = " + p1.hitungPajak());
        System.out.println("Pajak Pengusaha pe1 = " + pe1.hitungPajak());
        System.out.println("Pajak Petani pt1 = " + pt1.hitungPajak());

        System.out.println("\n===== MASA KERJA =====");
        System.out.println("Masa Kerja PNS p1 = " + p1.hitungMasaKerja() + " tahun");
        System.out.println("Masa Kerja Pengusaha pe1 = " + pe1.hitungMasaKerja() + " tahun");
        System.out.println("Masa Kerja Petani pt1 = " + pt1.hitungMasaKerja() + " tahun");

        System.out.println("\n===== DETAIL DATA =====");
        p1.cetakInfo();
        System.out.println();
        pe1.cetakInfo();
        System.out.println();
        pt1.cetakInfo();
        System.out.println();
        p2.cetakInfo();
    }
}