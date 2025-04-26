package com.mycompany.tp1.poo_gpi2a;

import java.util.Scanner;


public class PRODUCTOS {
    private Scanner scanner = new Scanner(System.in);
    private int[] CANTIDADES;
    private double[] COSTOS;
    
    public PRODUCTOS() {
    }

    public PRODUCTOS(int[] CANTIDADES, double[] COSTOS) {
        this.CANTIDADES = CANTIDADES;
        this.COSTOS = COSTOS;
    }
    
    public void setProductos() {
        int A_CARGAR;
        
        System.out.println("Ingrese el total de productos a cargar: ");
        A_CARGAR = scanner.nextInt();
        
        CANTIDADES = new int[A_CARGAR];
        COSTOS = new double[A_CARGAR];

         for (int i = 0; i < A_CARGAR; i++) {
            System.out.println("CANTIDAD de producto #" + (i+1) + ":");
            CANTIDADES[i] = scanner.nextInt();
            System.out.println("VALOR de producto #" + (i+1) + ":");
            COSTOS[i] = scanner.nextDouble();
        }
    }
    
    public double getTotal() {
        double TOTAL = 0;
        for (double precio : COSTOS) {
            TOTAL =+ precio;
        }
        
        return TOTAL;
    }
    
    public int getMayorAMil() {     
        int MAYOR = 0;
        for (double precio : COSTOS) {
            if (precio > 1000) {
                MAYOR++;
            }
        }
        
        return MAYOR;
    }
    
}
