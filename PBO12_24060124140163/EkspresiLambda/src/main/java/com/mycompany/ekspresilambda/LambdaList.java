/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ekspresilambda;

/**
 *
 * @author Legion
 */

import java.util.ArrayList;

/**
 * File         : LambdaList.java
 * Deskripsi    : Implementasi lambda pada List, digunakan sebagai parameter
 *                pada method.
 * Pembuat      : Djuan Setyo Jati - 24060124140163
 * Tanggal      : Sabtu, 06 Juni 2026
 */

public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");

        //lambda digunakan sebagai parameter
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}