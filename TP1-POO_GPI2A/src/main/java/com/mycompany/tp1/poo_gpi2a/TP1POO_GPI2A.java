package com.mycompany.tp1.poo_gpi2a;
import java.util.Arrays;
import java.util.Scanner;

public class TP1POO_GPI2A {

    public static void main(String[] args) {
        
        
        
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
