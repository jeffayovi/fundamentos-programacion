/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problema3;

import java.util.Scanner;

/**
 * Escribir un programa que lea dos enteros en las variables x y y, y a continuación obtenga 
   los valores de: 1. x / y, 2. x % y; después, ejecutar el programa varias veces con diferentes 
   pares de enteros como entrada.
 * 
 */
public class Problema3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int x,y;
        
        System.out.println("Ingresar el dos enteros: ");
        x = entrada.nextInt();
        y = entrada.nextInt();
        
        System.out.println(x / y);
        System.out.println(x % y);
        
        
    }
}
