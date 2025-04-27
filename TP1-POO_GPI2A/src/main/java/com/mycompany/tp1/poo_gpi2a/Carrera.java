package com.mycompany.tp1.poo_gpi2a;

import java.util.Scanner;

public class Carrera {
    private int[][] listaCompetidores;
    private int nroCompetidores;

    public Carrera() {
        this.nroCompetidores = 12;
        this.listaCompetidores = new int[nroCompetidores][2];
    }

    public Carrera(int nroCompetidores) {
        this.nroCompetidores = nroCompetidores;
        this.listaCompetidores = new int[nroCompetidores][2];
    }
    
    public void setListaCompetidores() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingrese a continuacion sus competidores: ");
        
        for (int fila = 0; fila < nroCompetidores; fila++) {
            for (int columna = 0; columna < 2; columna++) {
                switch (columna) {
                    case 0:
                        System.out.println("Ingrese el nro de vehiculo: ");
                        listaCompetidores[fila][columna] = scanner.nextInt();
                        break;
                    case 1:
                        System.out.println("Ingrese el tiempo en segundos del vehiculo #" + (fila + 1));
                        listaCompetidores[fila][columna] = scanner.nextInt();
                        break;
                }   
            }
        }
    }

    public String getMejorCompetidor() {
        int auto = 0;
        int tiempo = 31536000; // segun google es 1 año en seg :)
        
        for (int fila = 0; fila < nroCompetidores; fila++) {
            int tiempoCompetidor = listaCompetidores[fila][1];
            if (tiempoCompetidor < tiempo) {
                tiempo = tiempoCompetidor;
                auto = listaCompetidores[fila][0];
            }
        }
        
        return "El vehiculo nro " + auto + " se lleva el premio a mejor tiempo con " + tiempo + " segundos de carrera.";
    }
}
