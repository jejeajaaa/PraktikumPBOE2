package POLIMORFISME_UNIVERSAL_INCLUSION.NO_4;

class MainSeminar {
    public static void main(String[] args) {
        Seminar seminar = new Seminar();

        Mahasiswa mahasiswa1 = new Mahasiswa("Budi", "24060123130001");
        Mahasiswa mahasiswa2 = new Mahasiswa("Siti", "24060123130002");
        Dosen dosen1 = new Dosen("Pak Andi", "198001012005011001");

        seminar.registrasi(mahasiswa1);
        seminar.registrasi(mahasiswa2);
        seminar.registrasi(dosen1);

        seminar.tampilPeserta();
        System.out.println("Jumlah peserta: " + seminar.countPeserta());
        System.out.println("Jumlah mahasiswa: " + seminar.countMahasiswa());
        System.out.println("Jumlah dosen: " + seminar.countDosen());
    }
}
