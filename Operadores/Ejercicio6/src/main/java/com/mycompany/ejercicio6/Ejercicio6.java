/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio6;

import java.util.Scanner;

/**
 * Hacer un programa que calcule el cuadrado de una suma
 *
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        double numero1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número:");
        double numero2 = scanner.nextDouble();

        double cuadradoSuma = Math.pow(numero1, 2) + Math.pow(numero2, 2) + 2 * numero1 * numero2;

        System.out.println("El cuadrado de la suma es: " + cuadradoSuma);
    }
}
