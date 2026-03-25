
/* Nama File    : MBangunDatar.java
 * Deskripsi    : Membuat class MBangunDatar untuk menguji class Persegi dan Lingkaran
 * Pembuat      : Djuan Setyo Jati / 24060124140163
 * Tanggal      : Rabu, 25 Juni 2026
 */

public class MBangunDatar {
    public static void main(String[] args) {
        System.out.println("===== PERSEGI =====");
        Persegi persegi = new Persegi();
        persegi.setJmlSisi(4);
        persegi.setPersegi(5, "Biru", "Tebal");
        System.out.println("Luas Persegi : " + persegi.getLuas());
        System.out.println("Keliling Persegi : " + persegi.getKeliling());
        System.out.println("Diagonal Persegi : " + persegi.getDiagonal());
        System.out.println("Informasi Persegi : ");
        System.out.println("================================");
        persegi.printInfo();

        System.out.println("\n ===== LINGKARAN =====");
        Lingkaran lingkaran = new Lingkaran(10, "Merah", "Merah", "Tebal");
        System.out.println("Luas Lingkaran : " + lingkaran.getLuas());
        System.out.println("Keliling Lingkaran : " + lingkaran.getKeliling());
        System.out.println("Diagonal Lingkaran : " + lingkaran.Diagonal());
        System.out.println("Informasi Lingkaran : ");
        System.out.println("================================");
        lingkaran.printInfo();

        System.out.println("\n ===== IMPLEMENTASI ABSTRACT ====="); 
        BangunDatar P1 = new Persegi(10, "Kuning", "Tebal");
        Persegi P2 = new Persegi(5, "Hijau", "Tipis");
        BangunDatar L1 = new Lingkaran(7, "Ungu", "Tebal", "Tebal");
        Lingkaran L2 = new Lingkaran(14, "Cyan", "Tebal", "Tebal");
        System.out.println("Luas Persegi P1 : " + P1.getLuas());
        System.out.println("Luas Persegi P2 : " + P2.getLuas());
        System.out.println("Luas Lingkaran L1 : " + L1.getLuas());
        System.out.println("Luas Lingkaran L2 : " + L2.getLuas());
        System.out.println("Apakah luas P1 sama dengan luas P2? " + P1.isEqualLuas(P2));
        System.out.println("Apakah luas L1 sama dengan luas L2? " + L1.isEqualLuas(L2));
    }
}
