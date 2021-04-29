/*
Nama : Ibrohim Huzaimi
NIM : 19102005
Kelas : 7K
 */
package com.baim.pertemuan3.unguided;

/**
 *
 * @author Baim
 */
public class Lingkaran {
    int r;
    double keliling,a, luas;

    public Lingkaran(int r) {
        this.r = r;
    }

    public Lingkaran() {
    }

    public void setR(int r) {
        this.r = r;
    }
    
    double kelilingLingkaran(){
        keliling = 2 * 3.14 * r;
        a = (keliling*100)/100;
        System.out.println("Keliling lingkaran adalah: " + a + "cm");
        return keliling;
    }
    
    double luasLingkaran(){
        luas = 3.14*r*r; 
        System.out.println("Luas lingkaran adalah: " + luas + "cm^2");
        return luas;
    }
}
