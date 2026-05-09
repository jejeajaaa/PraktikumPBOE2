package Anabul;

// Nama File    : Datum.java
// NIM          : 2406012313
// Nama         : Gabriel Prakosa Ardhi

// T extends Kucing artinya T hanya boleh Kucing atau anak-anaknya
public class Datum<T extends Kucing> {
    private T isi;

    public void setIsi(T isibaru) { 
        this.isi = isibaru; 
    }

    public T getIsi() { 
        return this.isi; 
    }
}
