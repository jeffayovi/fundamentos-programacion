/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3;

import java.util.Scanner;

/**
 *Guillermo tiene N dolares. Luis tiene la mitad de lo que posee Guillermo.Juan tiene la mitad de lo que possen Luis y Guillermo justos  
 * Hacer un programa que calcule e imprima la cantidad de dinero que tienen entre los tres 
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de dinero que tiene Guillermo:");
        double dineroGuillermo = scanner.nextDouble();

        double dineroLuis = dineroGuillermo / 2;
        double dineroJuan = (dineroGuillermo + dineroLuis) / 2;

        double dineroTotal = dineroGuillermo + dineroLuis + dineroJuan;

        System.out.println("La cantidad de dinero que tienen entre los tres es: " + dineroTotal);
    }
}
