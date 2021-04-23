/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.baim.praktikum1;

/**
 *
 * @author ASUS
 */
public class DemoLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("For Loop ("+i+"/5");
            System.out.println("");
        }
        
        int j=1;
        while (j<=5){
            System.out.println("While loop("+j+"/5");
            j++;
        }
        System.out.println("");
        
        int k=1;
        do {
            System.out.println("Do-while loop("+k+"/5");
            k++;
        } while (k<=5);
        System.out.println("");
        
        int x=0;
        while(x<999999) {
            System.out.println("Looping...("+x+"/999999");
            x++;
            
            if(x == 5){
                System.out.println("Finishing");
                break;
            }
        }
    }
}
