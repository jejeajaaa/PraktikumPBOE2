/**
 * File         : Program.java
 * Deskripsi    : Kelas ini sebagai program utama 
 * Pembuat      : Djuan Setyo Jati - 24060124140163
 * Tanggal      : Sabtu, 06 Juni 2026
 */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbc.program;

/**
 *
 * @author Legion
 */

import java.util.ArrayList;
import java.util.List;
import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaservice;

public class Program {

    static MysqlMahasiswaservice service = new MysqlMahasiswaservice();

    public static void main(String[] args) {
        List<Mahasiswa> listmhs = new ArrayList<>();
        System.out.println("");

        // insert
        System.out.println("===insert");
        Mahasiswa mhsAdd = new Mahasiswa(5, "Haryo");
        service.add(mhsAdd);
        System.out.println("berhasil insert: " + mhsAdd);
        displayAll();

        // update
        System.out.println("===update");
        Mahasiswa mhsUpdate = service.getById(5);
        System.out.println("Akan diupdate data lama: " + mhsUpdate);
        mhsUpdate.setNama("Dinaya");
        System.out.println("dengan data baru: " + mhsUpdate);
        service.update(mhsUpdate);
        displayAll();

        // delete
        System.out.println("===delete");
        System.out.println("akan di delete: " + service.getById(5));
        service.delete(5);
        displayAll();
    }

    // Method penunjang untuk menampilkan semua data sesuai tampilan di output
    public static void displayAll() {
        System.out.println("===displayAll");
        List<Mahasiswa> list = service.getAll();
        for (Mahasiswa mhs : list) {
            System.out.println("Mahasiswa{id=" + mhs.getId() + ", nama=" + mhs.getNama() + "}");
        }
        System.out.println("");
    }
}