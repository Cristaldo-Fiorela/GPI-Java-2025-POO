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
        if (CANTIDADES.length == 0 || COSTOS.length == 0) {
            throw new IllegalStateException("No hay datos existentes, ejecute el metodo setProductos() para realizar su carga");
        }
        
        double TOTAL = 0;
        for (double precio : COSTOS) {
            TOTAL =+ precio;
        }
        
        return TOTAL;
    }
    
    


}
