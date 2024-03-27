/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problema2;

/**
 *Escribir sentencias de asignación que permitan intercambiar los valores de dos variable
 * 
 */
public class Problema2 {

    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 23;
        int temp;
        
        temp = num1;
        num1 = num2;
        num2 = temp;
        
        System.out.println(num1);
        System.out.println(num2);
    }
}
