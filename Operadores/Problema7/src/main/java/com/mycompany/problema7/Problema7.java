/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problema7;

import java.util.Scanner;

/**
 *Escribir un programa que introduzca el número de un mes (1 a 12) y visualice el número de sus días. 
 * 28 o 29 dias 
 * 2.Febrero
 * 
 * 30 dias
 * 3.Abril
   6.Junio
   9.Septiembre
   11.Noviembre
   *
   31 dias
   1.Enero
   3.Marzo
   5.Mayo
   7.Junio
   8.Agosto
   10.Octubre
   12.Diciembre
  * 
 
 *
 */
public class Problema7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int meses = 0;
        
        System.out.println("Ingresa numero de mes: ");
        meses = entrada.nextInt();
        
        if(meses == 2){
            System.out.println("28 o 29 dias ");
        }else if(meses == 3 || meses == 6 || meses == 9 || meses == 12){
            System.out.println("30 dias");
        
        }else{
            System.out.println("31 dias");
        }
        
    }
}
