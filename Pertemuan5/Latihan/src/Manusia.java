/* Nama File    : Manusia.java
 * Deskripsi    : Membuat class Manusia sebagai parent dari Pengusaha dan Pekerja
 * Pembuat      : Djuan Setyo Jati / 24060124140163
 * Tanggal      : Rabu, 25 Juni 2026
 */

import java.time.LocalDate;

public abstract class Manusia {
    private String nama;
    private LocalDate tgl_mulai_kerja;
    private String alamat;
    private double pendapatan;
    private static int counterMns;

    public Manusia() {
        this("", LocalDate.now(), "", 0.0);
    }

    public Manusia(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan){
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    public String getNama(){
        return this.nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public LocalDate getTgl_mulai_kerja(){
        return this.tgl_mulai_kerja;
    }

    public void setTgl_mulai_kerja(LocalDate tgl_mulai_kerja){
        this.tgl_mulai_kerja = tgl_mulai_kerja;
    }

    public String getAlamat(){
        return this.alamat;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public double getPendapatan(){
        return this.pendapatan;
    }

    public void setPendapatan(double pendapatan){
        this.pendapatan = pendapatan;
    }

    public static int getCounterMns(){
        return counterMns;
    }

    public void cetakInfo(){
        System.out.println("Nama : " + this.nama);
        System.out.println("Tanggal Mulai Kerja : " + this.tgl_mulai_kerja);
        System.out.println("Alamat : " + this.alamat);
        System.out.println("Pendapatan : Rp " + String.format("%,.0f", this.pendapatan));
    }

    public abstract int hitungMasaKerja();

}