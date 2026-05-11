// Nama File    : MainTeman.java
// NIM          : 2406012313
// Nama         : Gabriel Prakosa Ardhi
// Tanggal      : 8 Mei

public class MainTeman {
    public static void main(String[] args) {
        Teman teman = new Teman();

        teman.addNama("Budi");
        teman.addNama("Ani");
        teman.addNama("Budi");
        teman.addNama("Citra");

        System.out.println("=== Aplikasi Kelas Teman ===");
        teman.showTeman();
        System.out.println("Jumlah teman: " + teman.getNbelm());
        System.out.println("Nama pada indeks ke-1: " + teman.getNama(1));

        teman.setNama(1, "Andi");
        System.out.println("\nSetelah nama indeks ke-1 diubah:");
        teman.showTeman();

        System.out.println("Apakah Budi anggota? " + teman.isMember("Budi"));
        System.out.println("Jumlah nama Budi: " + teman.countNama("Budi"));

        teman.gantiNama("Citra", "Dina");
        System.out.println("\nSetelah Citra diganti menjadi Dina:");
        teman.showTeman();

        teman.delNama("Budi");
        System.out.println("\nSetelah satu nama Budi dihapus:");
        teman.showTeman();
        System.out.println("Jumlah teman: " + teman.getNbelm());
    }
}
