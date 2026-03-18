/* Nama File    : MTitik.java
 * Deskripsi    : Main class untuk menguji class Titik
 * Pembuat      : Djuan Setyo Jati (24060124140163)
 * Tanggal      : 27 Februari 2025
 */

public class MTitik {
    public static void main(String[] args) {
        // Membuat objek titik T1 (0,0)
        Titik T1 = new Titik(); 
        T1.setAbsis(3);     // mengubah absis T1 menjadi 3
        T1.setOrdinat(4);   // mengubah ordinat T1 menjadi 4
        
        System.out.print("T1: ");
        T1.printTitik();    // mencetak koordinat T1
        
        T1.geser(3, 4);     // menggeser T1 sejauh (3,4)
        System.out.print("T1 setelah digeser: ");
        T1.printTitik(); 
        
        System.out.println("-------------------------");
        
        // Bagian 2 - Object Reference
        // T2 merujuk ke objek yang sama dengan T1
        Titik T2 = T1;
        System.out.print("T2 (referensi dari T1): ");
        T2.printTitik();
        
        // Mengubah nilai melalui T1 akan berdampak pada T2
        T1.setAbsis(10);
        T1.setOrdinat(10);
        System.out.print("T2 setelah T1 diubah (10,10): ");
        T2.printTitik();
        
        // Membuat objek baru dengan konstruktor parameter (overloading)
        Titik T3 = new Titik(5, 2);
        System.out.print("T3 (konstruktor parameter): ");
        T3.printTitik();
    }
}