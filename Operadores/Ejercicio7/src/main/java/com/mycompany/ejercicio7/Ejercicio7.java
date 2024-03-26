/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio7;

import java.util.Scanner;

/**
 *Contruir un programa que dado un numero total de horas, debuelve el numero de semanas, dias y horas equivalentes.
 * Por ejemplo, dado un total 1000 horas debe mostrar 5 semanas, 6 dias y 16 horas 
 * 
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número total de horas:");
        int totalHoras = scanner.nextInt();

        int horasEnSemana = 24 * 7;
        int horasEnDia = 24;

        int semanas = totalHoras / horasEnSemana;
        int horasRestantes = totalHoras % horasEnSemana;

        int dias = horasRestantes / horasEnDia;
        horasRestantes = horasRestantes % horasEnDia;

        System.out.println("El tiempo equivalente es: " + semanas + " semanas, " + dias + " días y " + horasRestantes + " horas.");
    }
}
