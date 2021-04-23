/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.baim.praktikum1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class DemoScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("==> Edit Profile <==");
        System.out.println("");
        
        System.out.println("Masukan nama: ");
        String nama = input.nextLine();
        
        System.out.println("Masukan Inisial: ");
        char initial = input.nextLine().charAt(0);
        
        System.out.println("Masukan Usia: ");
        int usia = input.nextInt();
        
        System.out.println("Masukan Tinggi Badan: ");
        float tinggi = input.nextFloat();
        
        System.out.println("");
        System.out.println("==> Profile Saya <==");
        System.out.println("");
        System.out.println("Nama    : " + nama);
        System.out.println("Inisial : " + initial);
        System.out.println("Usia    : " + usia + " Tahun");
        System.out.println("Tinggi  : " + tinggi + " cm");
        
        
        
                
    }
}
