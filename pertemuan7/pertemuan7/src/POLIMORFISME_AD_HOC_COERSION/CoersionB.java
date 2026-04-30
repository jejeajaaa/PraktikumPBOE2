/* NIM  : 24060123130094
   Nama : Gabriel Prakosa Ardhi
   Tgl  : 24 April 2026
*/

package POLIMORFISME_AD_HOC_COERSION;


public class CoersionB {
    public static void main(String[] args) {
        // Atribut
        int nilaiINT = 65;
        double nilaiREAL = (double) nilaiINT;
        int backToINT = (int) nilaiREAL;

        // Method
        System.out.println("Nilai real : " + nilaiREAL);
        System.out.println("Nilai integer : " + backToINT);
    }
}