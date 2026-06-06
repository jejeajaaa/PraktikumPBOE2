/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ekspresilambda;

/**
 *
 * @author Legion
 */

import java.util.HashMap;
import java.util.Map;

/**
 * File         : LambdaMap.java
 * Deskripsi    : Implementasi lambda pada Map
 * Pembuat      : Djuan Setyo Jati - 24060124140163
 * Tanggal      : Sabtu, 06 Juni 2026
 */

public class LambdaMap {
    public static void main(String[] args) {

        // Membuat Map dengan key = NIM dan value = Nama
        Map<String, String> mahasiswaMap = new HashMap<>();

        mahasiswaMap.put("24060124120026", "Gregorius");
        mahasiswaMap.put("24060124120027", "Bambang");
        mahasiswaMap.put("24060124120028", "Cici");
        mahasiswaMap.put("24060124120029", "Didi");

        // Lambda digunakan untuk menampilkan key dan value
        mahasiswaMap.forEach((nim, nama) ->
            System.out.println("NIM : " + nim + 
                               ", Nama : " + nama)
        );
    }
}
