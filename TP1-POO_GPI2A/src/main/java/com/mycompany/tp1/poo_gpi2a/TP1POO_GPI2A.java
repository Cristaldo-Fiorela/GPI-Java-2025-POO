package com.mycompany.tp1.poo_gpi2a;
import java.util.Arrays;
import java.util.Scanner;

public class TP1POO_GPI2A {

    public static void main(String[] args) {
        // EJERCICIO 1
        Scanner scanner = new Scanner(System.in);
        int A_CARGAR;
        float[] NOTAS;
        float MAYOR = 0;
        
        System.out.println("Ingrese la cantidad de notas a cargar: ");
        A_CARGAR = scanner.nextInt();
        
        NOTAS = new float[A_CARGAR];
        
        for (int i = 0; i < A_CARGAR; i++) {
            float nota = -1;
            
            while (nota < 0 || nota > 10) {
                System.out.println("Ingrese la siguiente nota a cargar:");
                nota = scanner.nextFloat();

                if (nota < 0 || nota > 10) {
                    System.out.println("Nota invalida. Debe estar entre 0 y 10.");
                }
                
                NOTAS[i] = nota;
            }
        }
        
        for (float nota : NOTAS) {
            if (nota > MAYOR) {
                MAYOR = nota;
            }
        }
        
        System.out.println("La nota mayor cargada es: " + MAYOR); 
        scanner.close();
    }
}
