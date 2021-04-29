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
public class PersegiPanjang {
    int luas, keliling, panjang, lebar;

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }
    
    int kelilingPersegiPanjang(){
        keliling = 2*(panjang+lebar);
        System.out.println("Keliling Persegi Panjang Adalah: " + keliling + "cm");
        return keliling;
    }
    
    int luasPersegiPanjang(){
        luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang Adalah: " + luas + "cm^2");
        return luas;
    }
}
