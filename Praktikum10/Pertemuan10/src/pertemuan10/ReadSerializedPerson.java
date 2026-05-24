/**
 * File         : ReadSerializedPerson.java
 * Deskripsi    : Program untuk deserialisasi objek Person
 * Pembuat      : Djuan Setyo Jati / 24060124140163
 * Tanggal      : Kamis, 21 Mei 2026
 */

package pertemuan10;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadSerializedPerson {
    public static void main(String[] args) {
        try (FileInputStream f = new FileInputStream("person.ser");
             ObjectInputStream s = new ObjectInputStream(f)) {
            Person person = (Person) s.readObject();
            System.out.println("serialized person name = " + person.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
