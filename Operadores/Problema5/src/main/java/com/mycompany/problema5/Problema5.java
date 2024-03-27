/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problema5;

import java.util.Scanner;

/**
 *Escribir un programa que solicite dos números decimales, los sume y, al final, visualice 
  la respuesta. 
 * 
 */
public class Problema5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        float num1,num2,resultado;
        
        System.out.println("Ingresa dos numero decimales: ");
        num1 = entrada.nextFloat();
        num2 = entrada.nextFloat();
        
        resultado = num1 + num2;
        
        System.out.println(resultado);
        
        
        
    }
}
