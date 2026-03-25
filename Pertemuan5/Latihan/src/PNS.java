
/* Nama File    : PNS.java
 * Deskripsi    : Membuat class PNS dengan inherit Manusia dan implement Pajak
 * Pembuat      : Djuan Setyo Jati / 24060124140163
 * Tanggal      : Rabu, 25 Juni 2026
 */

import java.time.LocalDate;
import java.time.Period;

public class PNS extends Manusia implements Pajak {
    private String nip;
    private static int counterPNS;
    private static final int A = 6;

    public PNS(){
        super();
        nip = "";
        counterPNS++;
    }

    public PNS(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String nip){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public String getNip(){
        return this.nip;
    }

    public void setNip(String nip){
        this.nip = nip;
    }

    public static int getCounterPNS(){
        return counterPNS;
    }

    @Override
    public int hitungMasaKerja(){
        Period period = Period.between(getTgl_mulai_kerja(), LocalDate.now());
        return period.getYears() + A;
    }

    @Override
    public double hitungPajak() {
        return getPendapatan() * 0.1;
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NIP : " + nip);
    }
}
