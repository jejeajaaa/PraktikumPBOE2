package Anabul;

public class Anggora extends Kucing {
    public Anggora(String nama, double bobot) { 
        super(nama, bobot); 
    }

    @Override 
    public String toString() { 
        return "Anggora: " + nama + " (" + bobot + " kg)"; 
    }
}
