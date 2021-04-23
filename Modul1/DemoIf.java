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
public class DemoIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukan Bilangan: ");
        int bil = input.nextInt();
        
        if(bil > 0)
            System.out.println(bil + " adalah bilangan positif!");
        else if(bil < 0 )
            System.out.println(bil + " adalah bilangan negatif");
        else
            System.out.println(bil + " adalah nol!");
        
    }
}
