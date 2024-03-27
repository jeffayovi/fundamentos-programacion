/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problema4;

import java.util.Scanner;

/**
 *Escribir un programa que solicite ingresar longitud y anchura de una habitación; hecho 
  esto, visualice su superficie con esos datos.
 * 
 */
public class Problema4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        double longitud,anchura;
        double superficie;
        
        System.out.println("Ingresa la Longitud: ");
        longitud = entrada.nextDouble();
        System.out.println("Ingresa la Anchura: ");
        anchura = entrada.nextDouble();
        
        superficie = longitud * anchura;
        
        System.out.println("Superficie de cuarto: "+superficie);
    }
}
