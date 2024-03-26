/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio8;

import java.util.Scanner;

/**
 *Contruir un programa que calcule y muestre por pantalla las raices de ecuacion de segundo grado de coeficiente reales 
 * 
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el coeficiente a:");
        double a = scanner.nextDouble();

        System.out.println("Ingrese el coeficiente b:");
        double b = scanner.nextDouble();

        System.out.println("Ingrese el coeficiente c:");
        double c = scanner.nextDouble();
        
        double discriminante = Math.pow(b, 2) - (4 * a * c);

        if (discriminante > 0) {
            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Las raíces de la ecuación son: " + raiz1 + " y " + raiz2);
        } else if (discriminante == 0) {
            double raiz = -b / (2 * a);
            System.out.println("La ecuación tiene una única raíz: " + raiz);
        } else {
            System.out.println("La ecuación no tiene raíces reales.");
        }
    }
}
    

