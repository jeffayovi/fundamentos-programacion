/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problema8;

import java.util.Scanner;

/**
 * Escribir un programa que lea dos números y visualice al mayor; utilizar el operador ternario ?:.
 * 
 */
public class Problema8 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int num1,num2;
        
        System.out.println("Ingresar dos numero enteros: ");
        num1 = entrada.nextInt();
        num2 = entrada.nextInt();
        
        int mayor = (num1 > num2) ? num1 :num2;
        System.out.println("El mayor número es: " +mayor);
    }
}
