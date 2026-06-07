/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.owi.pbo12;

/**
 *
 * @author jeje
 */
import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        // Mendeklarasikan Map dengan Key bertipe String (NIM) dan Value bertipe String (Nama)
        Map<String, String> mahasiswaMap = new HashMap<>();

        // Menambahkan data ke dalam Map
        mahasiswaMap.put("24060123120001", "Adi");
        mahasiswaMap.put("24060123120002", "Bambang");
        mahasiswaMap.put("24060123120003", "Cici");
        mahasiswaMap.put("24060123120004", "Didi");

        System.out.println("Daftar Mahasiswa:");
        
        // Menggunakan ekspresi lambda untuk menampilkan key dan value
        // Berbeda dengan List yang hanya punya 1 parameter, Map memiliki 2 parameter (key, value)
        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + " | Nama: " + nama));
    }
}