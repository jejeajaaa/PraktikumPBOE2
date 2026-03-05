public class Matakuliah {
    private String idMatkul;
    private String nama;
    private int sks;

    public Matakuliah(){
        this("0", "Placeholder", 0);
    }

    public Matakuliah(String idMatkul, String nama, int sks){
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }

    public String getID(){
        return idMatkul;
    }

    public String getNama(){
        return nama;
    }

    public int getSks(){
        return sks;
    }

    public void setID(String idMatkul){
        this.idMatkul = idMatkul;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setSks(int sks){
        this.sks = sks;
    }

    public void printMatkul(){
        System.out.println("ID Matkul = " + idMatkul + ", Nama = " + nama + ", SKS = " + sks);
    }
}