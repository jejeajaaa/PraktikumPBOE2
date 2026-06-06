/**
 * File         : MysqlMahasiswaservice.java
 * Deskripsi    : Kelas ini berperan menyediakan layanan (service/controller) bagi program utama 
                  dalam mengelola basisdata sehingga interaksi dengan basis data dapat dilakukan 
                  secara object oriented (dengan memanfaatkan model dan DB utility)
  * Pembuat      : Djuan Setyo Jati - 24060124140163
 * Tanggal      : Sabtu, 06 Juni 2026

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.service;

/**
 *
 * @author Legion
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;

public class MysqlMahasiswaservice {
    private Connection koneksi = null;

    // Constructor
    public MysqlMahasiswaservice() {
        // Mengambil koneksi dari MysqlUtility saat service diinisialisasi
        this.koneksi = MysqlUtility.getConnection();
    }

    /** Membuat objek mahasiswa */
    public Mahasiswa makeMhsObject(int id, String nama) {
        return new Mahasiswa(id, nama);
    }

    /** Menambahkan data mahasiswa */
    public void add(Mahasiswa mhs) {
        String sql = "INSERT INTO mahasiswa (id, nama) VALUES (?, ?)";
        try (PreparedStatement ps = koneksi.prepareStatement(sql)) {
            ps.setInt(1, mhs.getId()); // Mengirimkan angka 5 dari Program.java
            ps.setString(2, mhs.getNama());
            ps.executeUpdate();
            System.out.println("Data mahasiswa berhasil ditambahkan.");
        } catch (SQLException e) {
            System.out.println("Gagal menambahkan data: " + e.getMessage());
        }
    }

    /** Update data mahasiswa */
    public void update(Mahasiswa mhs) {
        String sql = "UPDATE mahasiswa SET nama = ? WHERE id = ?";
        try (PreparedStatement ps = koneksi.prepareStatement(sql)) {
            ps.setString(1, mhs.getNama());
            ps.setInt(2, mhs.getId());
            ps.executeUpdate();
            System.out.println("Data mahasiswa berhasil diubah.");
        } catch (SQLException e) {
            System.out.println("Gagal mengubah data: " + e.getMessage());
        }
    }

    /** Delete data mahasiswa sesuai id */
    public void delete(int id) {
        String sql = "DELETE FROM mahasiswa WHERE id = ?";
        try (PreparedStatement ps = koneksi.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Data mahasiswa berhasil dihapus.");
        } catch (SQLException e) {
            System.out.println("Gagal menghapus data: " + e.getMessage());
        }
    }

    /** Ambil mahasiswa sesuai id */
    public Mahasiswa getById(int id) {
        String sql = "SELECT * FROM mahasiswa WHERE id = ?";
        try (PreparedStatement ps = koneksi.prepareStatement(sql)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    Mahasiswa mhs = new Mahasiswa();
                    mhs.setId(rs.getInt("id"));
                    mhs.setNama(rs.getString("nama"));
                    return mhs;
                }
            }
        } catch (SQLException e) {
            System.out.println("Gagal mengambil data berdasarkan ID: " + e.getMessage());
        }
        return null;
    }

    /** Ambil semua isi tabel mahasiswa */
    public List<Mahasiswa> getAll() {
        List<Mahasiswa> list = new ArrayList<>();
        String sql = "SELECT * FROM mahasiswa";
        try (Statement stmt = koneksi.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Mahasiswa mhs = new Mahasiswa();
                mhs.setId(rs.getInt("id"));
                mhs.setNama(rs.getString("nama"));
                list.add(mhs);
            }
        } catch (SQLException e) {
            System.out.println("Gagal mengambil semua data: " + e.getMessage());
        }
        return list;
    }        
        /** Memeriksa apakah tabel kosong */
    public boolean isEmpty() {
        String sql = "SELECT COUNT(*) AS total FROM mahasiswa";
        try (Statement stmt = koneksi.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            if (rs.next()) {
                return rs.getInt("total") == 0;
            }
        } catch (SQLException e) {
            System.out.println("Gagal memeriksa status tabel: " + e.getMessage());
        }
        return true;
    }

    /** Menutup koneksi ke DB */
    public void closeConnection() {
        try {
            if (koneksi != null && !koneksi.isClosed()) {
                koneksi.close();
                System.out.println("Koneksi ke database berhasil ditutup.");
            }
        } catch (SQLException e) {
            System.out.println("Gagal menutup koneksi database: " + e.getMessage());
        }
    }
    
    /** Reset indeks tabel mahasiswa ke 1 */
    public void indexReset() {
        String sql = "ALTER TABLE mahasiswa AUTO_INCREMENT = 1";
        try (Statement stmt = koneksi.createStatement()) {
            stmt.executeUpdate(sql);
            System.out.println("Indeks Auto Increment berhasil di-reset ke 1.");
        } catch (SQLException e) {
            System.out.println("Gagal mereset indeks tabel: " + e.getMessage());
        }
    }
}
