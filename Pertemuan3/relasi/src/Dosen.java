public class Dosen {
    // 1. Atribut
    private String nip;
    private String nama;
    private String prodi;
    private static int countDosen;

    // 2. Konstruktor Tanpa Parameter
    public Dosen() {
        this("0", "Default", "Belum");
    }
    
    // 3. Konstruktor Pakai Parameter
    public Dosen(String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
        countDosen++; 
    }

    // 4. Selektor (Getter)
    public String getNip(){ 
        return nip;
    }

    public String getNama(){
        return nama;
    }

    public String getProdi(){
        return prodi;
    }

    // 5. Mutator (Setter)
    public void setNama(String nama){
        this.nama = nama;
    }

    public void setNip(String nip){ 
        this.nip = nip;
    }

    public void setProdi(String prodi){ 
        this.prodi = prodi;
    }

    public static int getCountDosen(){
        return countDosen;
    }

    public void printDosen(){
        System.out.println("NIP = " + nip + ", Nama = " + nama + ", Prodi = " + prodi);
    }
}