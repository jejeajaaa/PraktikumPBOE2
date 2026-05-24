/**
 * File         : MainDAO.java
 * Deskripsi    : Main program untuk akses DAO
 * Pembuat      : Djuan Setyo Jati / 24060124140163
 * Tanggal      : Kamis, 21 Mei 2026
 */

package pertemuan10;

import java.sql.SQLException;

public class MainDAO {
    public static void main(String args[]) {
        Person person = new Person("Indra");
        String password = args.length > 0 ? args[0] : "";

        DAOManager m = new DAOManager();
        if (args.length > 0) {
            m.setPersonDAO(new MySQLPersonDAO("root", password));
        } else {
            m.setPersonDAO(new MySQLPersonDAO());
        }
        
        try {
            m.getPersonDAO().savePerson(person);
            System.out.println("Data person berhasil disimpan ke database.");
        } catch (SQLException e) {
            System.out.println("Data person gagal disimpan ke database.");
            System.out.println("Pastikan MySQL aktif, database pbo dan tabel person sudah ada, serta password root benar.");
            System.out.println("Jika root memakai password, jalankan dengan argument: <password_mysql>");
        } catch (Exception e) {
            System.out.println("Terjadi error: " + e.getMessage());
        }
    }
}
