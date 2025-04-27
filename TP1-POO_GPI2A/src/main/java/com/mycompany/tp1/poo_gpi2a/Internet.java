package com.mycompany.tp1.poo_gpi2a;

import java.util.Scanner;

public class Internet {
    private int[][] listaClientes;
    private int nroClientes;

    public Internet() {
        this.nroClientes = 5;
        this.listaClientes = new int [nroClientes][2];
    }

    public Internet(int nroClientes) {
        this.nroClientes = nroClientes;
        this.listaClientes = new int [nroClientes][2];
    }
    
    private double Descuento(double monto, int descuento) {
        return monto * (1 - (descuento / 100.0));
    }
    
    public void setClientes() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("A continuacion cargue sus clientes: ");
        
        for (int fila = 0; fila < nroClientes; fila++) {
            for (int columna = 0; columna < 2; columna++) {
                switch (columna) {
                    case 0:
                        System.out.println("Por favor ingrese el DNI del cliente #" + (fila + 1) + " sin puntos o guiones");
                        listaClientes[fila][columna] = scanner.nextInt();
                        break;
                    case 1:
                        boolean cargaValida = false;
                        
                        while(!cargaValida) {
                            System.out.println("Por favor ingrese el PLAN del cliente #" + (fila + 1) + " (30 ,50, 100)");
                            int megas = scanner.nextInt();
                            if (megas != 30 && megas != 50 && megas != 100) {
                                System.out.println("Carga invalida. Ingrese: 30, 50 o 100");
                            } else {
                                listaClientes[fila][columna] =  megas;
                                cargaValida = true;
                            }
                        }
                        break;
                }
            }   
        }
    }

    public void getInforme() {
        for (int fila = 0; fila < nroClientes; fila++) {
            System.out.print("DNI: " + listaClientes[fila][0] + ", Plan: " + listaClientes[fila][1]);
            switch (listaClientes[fila][1]) {
                case 100:
                    System.out.println(", Debe pagar: $" + Descuento(1500, 5));
                    break;
                case 50:
                    System.out.println(", Debe pagar: $1100");
                    break;
                default:
                    System.out.println(", Debe pagar: $750");
                    break;
            }
        }
    }    
    
}
