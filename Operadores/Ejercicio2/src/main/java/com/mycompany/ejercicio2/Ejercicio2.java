/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;

import java.util.Scanner;

/**
 * Hacer un programa que calcule e imprima el salario semanal de un empleado a patir de su horas semanales trabajadas y de su salario por 
 * horas
 * 
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese las horas semanales trabajadas:");
        double horasTrabajadas = scanner.nextDouble();

        System.out.println("Ingrese el salario por hora:");
        double salarioPorHora = scanner.nextDouble();

        double salarioSemanal = horasTrabajadas * salarioPorHora;

        System.out.println("El salario semanal del empleado es: " + salarioSemanal);
    }
}
