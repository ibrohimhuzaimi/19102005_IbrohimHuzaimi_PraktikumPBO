/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.baim.pertemuan3.unguided;


import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean keeplooping = true;
        
        do{
        Scanner input = new Scanner(System.in);
        System.out.println("===============================================");
        System.out.println("Selamat Datang di Aplikasi Matematika Sederhana");
        System.out.println("===============================================");
        System.out.println("");
        System.out.println("1. Segitiga");
        System.out.println("2. Persegi");
        System.out.println("3. Lingkaran");
        System.out.println("4. Persegi Panjang");
        System.out.println("5. Exit");
        System.out.println(">");
        int pilihan = input.nextInt();
         
        if (pilihan == 1){
            System.out.println("1. Keliling Segitiga");
            System.out.println("2. Luas Segitiga");
            System.out.println(">");
            int masukkan = input.nextInt();
            if(masukkan == 1){
                System.out.println("Masukkan sisi A");
                int sisiA = input.nextInt();
                System.out.println("Masukkan sisi B");
                int sisiB = input.nextInt();
                System.out.println("Masukkan sisi C");
                int sisiC = input.nextInt();
                Segitiga segitiga = new Segitiga(sisiA, sisiB, sisiC);
                segitiga.keliling();
            } else if (masukkan == 2){
                System.out.println("Masukkan Alas");
                int alas = input.nextInt();
                System.out.println("Masukkan Tinggi");
                int tinggi = input.nextInt();
                Segitiga segitiga = new Segitiga(alas, tinggi);
                segitiga.luas();
            }
            
        } else if(pilihan == 2){
            System.out.println("1. Keliling Persegi");
            System.out.println("2. Luas Persegi");
            System.out.println(">");
            int masukkan = input.nextInt();
            if (masukkan == 1){
                System.out.println("Masukkan Sisi Persegi");
                int sisi = input.nextInt();
                Persegi persegi = new Persegi(sisi);
                persegi.keliling();
            } else if(masukkan == 2){
                System.out.println("Masukkan Sisi Persegi");
                int sisi = input.nextInt();
                Persegi persegi = new Persegi(sisi);
                persegi.luas();
            }
            
        } else if (pilihan == 3){
            System.out.println("1. Keliling Lingkaran");
            System.out.println("2. Luas Lingkaran");
            int masukkan = input.nextInt();
            if (masukkan == 1){
                System.out.println("Masukkan jari jari lingkaran: ");
                int jari = input.nextInt();
                Lingkaran lingkaran = new Lingkaran(jari);
                lingkaran.kelilingLingkaran();
            } else if (masukkan == 2){
                System.out.println("Masukkan jari jari lingkaran: ");
                int jari = input.nextInt();
                Lingkaran lingkaran = new Lingkaran(jari);
                lingkaran.luasLingkaran();
            }
            
        } else if (pilihan == 4){
            System.out.println("1. Keliling Persegi Panjang");
            System.out.println("2. Luas Persegi Panjang");
            System.out.println(">");
            int masukkan = input.nextInt();
            if (masukkan == 1){
                System.out.println("Masukkan Alas Persegi Panjang: ");
                int alas = input.nextInt();
                System.out.println("Masukkan Tinggi Persegi Panjang");
                int tinggi = input.nextInt();
                PersegiPanjang persegipjg = new PersegiPanjang(alas, tinggi);
                persegipjg.kelilingPersegiPanjang();
            } else if (masukkan == 2){
                System.out.println("Masukkan Alas Persegi Panjang: ");
                int alas = input.nextInt();
                System.out.println("Masukkan Tinggi Persegi Panjang");
                int tinggi = input.nextInt();
                PersegiPanjang persegipjg = new PersegiPanjang(alas, tinggi);
                persegipjg.luasPersegiPanjang();
            }
            
        } else if (pilihan == 5){
            System.out.println("Terimakasih sudah menggunakan aplikasi ini");
            keeplooping = false;
            }
        
    }while(keeplooping);
        
    }
    
}
