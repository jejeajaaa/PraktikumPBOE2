/**
 * File         : SerializePerson.java
 * Deskripsi    : Program untuk serialisasi objek Person
 * Pembuat      : Djuan Setyo Jati / 24060124140163
 * Tanggal      : Kamis, 21 Mei 2026
 */

package pertemuan10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializePerson {
    public static void main(String[] args) {
        Person person = new Person("Panji");

        try (FileOutputStream f = new FileOutputStream("person.ser");
             ObjectOutputStream s = new ObjectOutputStream(f)) {
            s.writeObject(person);
            System.out.println("selesai menulis objek person");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
