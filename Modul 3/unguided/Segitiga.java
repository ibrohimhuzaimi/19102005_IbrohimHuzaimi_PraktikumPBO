/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.baim.pertemuan3.unguided;

/**
 *
 * @author ASUS
 */
public class Segitiga {
    int sisiA, sisiB, sisiC, alas, tinggi,
                a, b, c, kelilingSegitiga;
    double luas;

    public Segitiga(int sisiA, int sisiB, int sisiC) {
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
    }

    public Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    
    public void setSisiA(int sisiA) {
        this.sisiA = sisiA;
    }

    public void setSisiB(int sisiB) {
        this.sisiB = sisiB;
    }

    public void setSisiC(int sisiC) {
        this.sisiC = sisiC;
    }
    
    int keliling(){
       kelilingSegitiga = sisiA+sisiB+sisiC;
       System.out.println("Keliling segitiga adalah: " + kelilingSegitiga + "cm");
       return kelilingSegitiga;
    }
    
    double luas(){
        this.alas = alas;
        this.tinggi = tinggi;
        
        luas = 0.5 * alas * tinggi;
        System.out.println("Luas segitiga adalah: " + luas + "cm^2");
        return luas;
    }
    
    
}
