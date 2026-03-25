/* Nama File    : Petani.java
 * Deskripsi    : Membuat class Petani dengan inherit Manusia dan implement Pajak
 * Pembuat      : Djuan Setyo Jati / 24060124140163
 * Tanggal      : Rabu, 25 Juni 2026
 */

import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia implements Pajak {
    private String asal_kota;
    private static int counterPetani;
    private static final int C = 0;

    public Petani(){
        super();
        asal_kota = "";
        counterPetani++;
    }

    public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    public String getAsal_kota(){
        return this.asal_kota;
    }

    public void setAsal_kota(String asal_kota){
        this.asal_kota = asal_kota;
    }

    public static int getCounterPetani(){
        return counterPetani;
    }

    @Override
    public int hitungMasaKerja(){
        Period period = Period.between(getTgl_mulai_kerja(), LocalDate.now());
        return period.getYears() + C;
    }
    
    @Override
    public double hitungPajak() {
        return 0;
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Asal Kota : " + asal_kota);
    }
}