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
public class Persegi {
    int sisi, keliling, luas;

    public Persegi(int sisi) {
        this.sisi = sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    int keliling(){
        keliling = sisi*4;
        System.out.println("Keliling persegi adalah: " + keliling + "cm");
        return keliling;
    }
    
    int luas(){
        luas = sisi * sisi;
        System.out.println("Luas persegi adalah: " + luas + "cm^2");
        return luas;
    }
    
}
