/* Nama File    : Pengusaha.java
 * Deskripsi    : Membuat class Pengusaha dengan inherit Manusia dan implement Pajak
 * Pembuat      : Djuan Setyo Jati / 24060124140163
 * Tanggal      : Rabu, 25 Juni 2026
 */

import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia implements Pajak {
    private String npwp;
    private static int counterPengusaha;
    public static final int B = 6; 

    public Pengusaha(){
        super();
        npwp = "";
        counterPengusaha++;
    }

    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String npwp){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public String getNpwp(){
        return this.npwp;
    }

    public void setNpwp(String npwp){
        this.npwp = npwp;
    }

    public static int getCounterPengusaha(){
        return counterPengusaha;
    }

    @Override
    public int hitungMasaKerja(){
        Period period = Period.between(getTgl_mulai_kerja(), LocalDate.now());
        return period.getYears() + B;
    }

    @Override
    public double hitungPajak() {
        return getPendapatan() * 0.15; // Pajak 15% dari pendapatan [cite: 115]
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NPWP : " + npwp);
    }
}
