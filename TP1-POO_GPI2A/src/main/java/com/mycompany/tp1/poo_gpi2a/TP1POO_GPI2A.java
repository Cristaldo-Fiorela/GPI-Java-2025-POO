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
        // EJERCICIO 2
        int APROBADOS = 0;
        int DESAPROBADOS = 0;
        
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
            }
            
            NOTAS[i] = nota;
        }
        
        for (float nota : NOTAS) {
            if (nota > MAYOR) {
                MAYOR = nota;
            }
            
            // EJERCICIO 2
            if (nota >= 6) {
                APROBADOS += 1;
            } else {
                DESAPROBADOS += 1;
            }
        }
        
        System.out.println("La mayor nota cargada es: " + MAYOR); 
        System.out.println("Hay " + APROBADOS + " aprobados y " + DESAPROBADOS + " desaprobados");
        
        // EJERCICIO 3
        int[] CANTIDADES;
        double[] COSTOS;
        int PRODUCTOS;
        
        System.out.println("Ingrese el total de productos a cargar: ");
        PRODUCTOS = scanner.nextInt();
        
        CANTIDADES = new int[PRODUCTOS];
        COSTOS = new double[PRODUCTOS];
        
        for (int i = 0; i < PRODUCTOS; i++) {
            System.out.println("CANTIDAD de producto #" + (i+1) + ":");
            CANTIDADES[i] = scanner.nextInt();
            System.out.println("VALOR de producto #" + (i+1) + ":");
            COSTOS[i] = scanner.nextDouble();
        }
        
        System.out.println(Arrays.toString(CANTIDADES));
        System.out.println(Arrays.toString(COSTOS));
        
        scanner.close();
    }
}
