// Nama File    : MainPiaraan.java
// NIM          : 2406012313
// Nama         : Gabriel Prakosa Ardhi
// Tanggal      : 8 Mei

public class MainPiaraan {
    public static void main(String[] args) {
        Piaraan piaraan = new Piaraan();

        Anabul oyen = new Kucing("Oyen", 4.2);
        Anabul momo = new Kucing("Momo", 3.7);
        Anabul bruno = new Anjing("Bruno", 8.5);
        Anabul rio = new Burung("Rio", 0.8);

        piaraan.enqueueAnabul(oyen);
        piaraan.enqueueAnabul(bruno);
        piaraan.enqueueAnabul(momo);
        piaraan.enqueueAnabul(rio);

        System.out.println("=== Aplikasi Kelas Piaraan ===");
        piaraan.showAnabul();
        System.out.println("Jumlah anabul: " + piaraan.getNbelm());
        System.out.println("Anabul pertama: " + piaraan.getAnabul().getNama());
        System.out.println("Apakah Oyen anggota? " + piaraan.isMember(oyen));
        System.out.println("Apakah Oyen keluarga Kucing? " + (oyen instanceof Kucing));

        System.out.println("\nJenis setiap anabul:");
        piaraan.showJenisAnabul();
        System.out.println("Jumlah keluarga kucing: " + piaraan.countKucing());
        System.out.println("Total bobot keluarga kucing: " + piaraan.bobotKucing());

        Anabul keluar = piaraan.dequeueAnabul();
        System.out.println("\nAnabul keluar dari antrean: " + keluar.getNama());
        System.out.println("Anabul pertama sekarang: " + piaraan.getAnabul().getNama());
        System.out.println("Jumlah anabul sekarang: " + piaraan.getNbelm());
    }
}
