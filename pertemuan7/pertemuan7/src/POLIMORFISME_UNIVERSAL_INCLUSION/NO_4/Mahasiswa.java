package POLIMORFISME_UNIVERSAL_INCLUSION.NO_4;

public class Mahasiswa extends Civitasakademika {
    // Atribut
    private String nim;

    // Method
    public Mahasiswa(String nama, String nim) {
        super(nama);
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    @Override
    public String getNomor() {
        return nim;
    }
}
