/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5;

import java.util.Scanner;

/**
 *La calificacion final de un estudiante de informatica se calcula con base a las cuatros aspectos de su redimiento academico: 
 * participacion, primer examen parcial,segundo examen parcial y examen final. Sabiendo que las calificaciones anteriores entran a la 
 * calificacion final con ponderaciones de 10%, 25%, 25%, y 40%. Hacer un programa que calcule e imprima la calificacion final obtenida 
 * por un estudiante 
 * 
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la calificación de participación:");
        double participacion = scanner.nextDouble();

        System.out.println("Ingrese la calificación del primer examen parcial:");
        double primerExamen = scanner.nextDouble();

        System.out.println("Ingrese la calificación del segundo examen parcial:");
        double segundoExamen = scanner.nextDouble();

        System.out.println("Ingrese la calificación del examen final:");
        double examenFinal = scanner.nextDouble();

        double calificacionFinal = (participacion * 0.10) + (primerExamen * 0.25) + (segundoExamen * 0.25) + (examenFinal * 0.40);

        System.out.println("La calificación final del estudiante es: " + calificacionFinal);
    }
}
