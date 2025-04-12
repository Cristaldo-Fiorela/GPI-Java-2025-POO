package com.mycompany.tp1.poo_gpi2a;
import java.util.Arrays;
import java.util.Scanner;

public class TP1POO_GPI2A {

    public static void main(String[] args) {
        // EJERCIRIO 1
        Scanner scanner = new Scanner(System.in);
        int A_CARGAR;
        float[] NOTAS;
        
        System.out.println("Ingrese la cantidad de notas a cargar: ");
        A_CARGAR = scanner.nextInt();
        
        NOTAS = new float[A_CARGAR];
        
        for (int i = 0; i < A_CARGAR; i++) {
            System.out.println("Ingrese la siguiente nota a cargar:");
            NOTAS[i] = scanner.nextFloat();
        }
        
        System.out.println(Arrays.toString(NOTAS));
        
        scanner.close();
    }
}
