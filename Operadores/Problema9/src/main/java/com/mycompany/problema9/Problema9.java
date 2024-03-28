/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problema9;

import java.util.Scanner;

/*
Escribir un programa que lea dos enteros de tres dígitos y calcule e imprima producto, 
cociente y resto cuando el primero se divide entre el segundo. 
  739     739
 x 12    / 12
 8868   R = 7   Q = 61
Analisis 
1) Entrada: dos numeros enteros 
2) Salida: producto,cociente y resto
Proseso:
3)Declarar dos variables  enteros num1 y num2
4) Validacion tres  si num1 <= 999 &&  num2 <= 999
5)calcular producto num1 * num2
6)calcular cociente num1 / num2
7)calcular resto num1 / num2
8) Imprimir producto, cociente y resto 

*/
public class Problema9 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int num1,num2;
        int producto,cociente,resto;
        
        System.out.println("Ingresar dos numeros entero de tres digitos: ");
        num1 = entrada.nextInt();
        num2 = entrada.nextInt();
        
        if(num1 <= 999 &&  num2 <= 999){
            producto = num1 * num2;
            cociente = num1 / num2;
            resto = num1 % num2;
            System.out.println("producto: "+producto);
            System.out.println("cociente:"+cociente);
            System.out.println("resto:"+resto);
        
        }else{
            System.out.println("no ingreso numero de tres dígitos");
        
        
        }
        
    }
}
