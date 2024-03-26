/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la primera calificación:");
        double calificacion1 = scanner.nextDouble();

        System.out.println("Ingrese la segunda calificación:");
        double calificacion2 = scanner.nextDouble();

        System.out.println("Ingrese la tercera calificación:");
        double calificacion3 = scanner.nextDouble();

        double suma = calificacion1 + calificacion2 + calificacion3;

        System.out.println("La suma de las calificaciones es: " + suma);
        
    }
}
