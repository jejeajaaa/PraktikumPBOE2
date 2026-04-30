/* NIM  : 24060124140163
   Nama : Djuan Setyo jati
   Tgl  : 30 April 2026
*/

package POLIMORFISME_AD_HOC_COERSION;


public class CoersionD {
    public static void main(String[] args) {
        // Atribut
        String P = "12.34";
        String Q = "56.78";
        String S = P + Q;
        double R = Double.parseDouble(P) + Double.parseDouble(Q);

        // Method
        System.out.println("String : " + S); // 12.3456.78
        System.out.println("Double : " + R); // 69.12
    }
}
