/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problema1;

import java.util.Scanner;

/**
 * Escribir un programa que lea un entero, lo multiplique por dos y a continuación lo escriba en pantalla.
 * 
 */
public class Problema1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int num,resultado;
        
        System.out.println("Ingresar un numero entero: ");
        num = entrada.nextInt();
        resultado = num * 2;
        
        System.out.println("Resultado: "+resultado);
        
        
    }
}
