/**
 * File         : DAOManager.java
 * Deskripsi    : pengelola DAO dalam program
 * Pembuat      : Djuan Setyo Jati / 24060124140163
 * Tanggal      : Kamis, 21 Mei 2026
 */

package pertemuan10;

public class DAOManager {
    private PersonDAO personDAO; 

    public void setPersonDAO(PersonDAO person) {
        personDAO = person; 
    }

    public PersonDAO getPersonDAO() {
        return personDAO;
    }
}
