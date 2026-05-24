/**
 * File         : MySQLPersonDAO.java
 * Deskripsi    : implementasi PersonDAO untuk MySQL
 * Pembuat      : Djuan Setyo Jati / 24060124140163
 * Tanggal      : Kamis, 21 Mei 2026
 */

package pertemuan10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MySQLPersonDAO implements PersonDAO {
    private static final String DB_URL = "jdbc:mysql://localhost/pbo";
    private static final String DEFAULT_DB_USER = "root";
    private static final String DEFAULT_DB_PASSWORD = "root";

    private final String user;
    private final String password;

    public MySQLPersonDAO() {
        this(DEFAULT_DB_USER, DEFAULT_DB_PASSWORD);
    }

    public MySQLPersonDAO(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public void savePerson(Person person) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String query = "INSERT INTO person(name) VALUES (?)";
        try (Connection con = DriverManager.getConnection(DB_URL, user, password);
             PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, person.getName());
            ps.executeUpdate();
        }
    }
}
