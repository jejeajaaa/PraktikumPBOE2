/* NIM  : 24060124140163
   Nama : Djuan Setyo jati
   Tgl  : 30 April 2026
*/

package POLIMORFISME_AD_HOC_COERSION;

public class CoersionA {
    public static void main(String[] args) {
        // Atribut
        int nilaiINT = 65;
        char nilaiCHAR = (char) nilaiINT;
        double nilaiREAL = (double) nilaiINT;

        // Method
        System.out.println("Sebagai integer : " + nilaiINT); // 65
        System.out.println("Sebagai karakter : " + nilaiCHAR); // A
        System.out.println("Sebagai real : " + nilaiREAL); // 65.0

        String str = "65";
        int STRtoINT = Integer.parseInt(str);
        double STRtoREAL = Double.parseDouble(str);
        System.out.println("parseInt : " + STRtoINT);
        System.out.println("parseDouble : " + STRtoREAL);

        String BackToStr = Integer.toString(nilaiINT);
        System.out.println("toString : " + BackToStr);
    }
}
