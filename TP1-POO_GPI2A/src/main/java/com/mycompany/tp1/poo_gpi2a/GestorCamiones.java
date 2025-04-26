package com.mycompany.tp1.poo_gpi2a;

import java.util.Scanner;

public class GestorCamiones {
    private int totalCamiones;
    private int cantidadDatosAPedir;
    private String[][] planilla;

    public GestorCamiones() {
        this.totalCamiones = 30;        
        this.cantidadDatosAPedir = 4;
        this.planilla = new String[totalCamiones][cantidadDatosAPedir];
    }

    public GestorCamiones(int totalCamiones, int cantidadDatosAPedir) {
        this.totalCamiones = totalCamiones;
        this.cantidadDatosAPedir = cantidadDatosAPedir;
        this.planilla = new String[totalCamiones][cantidadDatosAPedir];
    }
    
    public void setDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("A continuacion ingrese los datos pedidos de los camiones:");
        
        for (int fila = 0; fila < totalCamiones; fila++) {
            for (int columna = 0; columna < cantidadDatosAPedir; columna++) {
                switch(columna) {
                    case 0:
                        System.out.println("Ingrese la PATENTE del camion #" + fila + 1);
                        planilla[fila][columna] = scanner.next().toLowerCase();
                        break;
                    case 1:
                        System.out.println("Ingrese el NOMBRE y APELLIDO del chofer del camion #" + fila + 1);
                        planilla[fila][columna] = scanner.next().toLowerCase();
                        break;
                    case 2:
                        boolean cargaValida = false;
                        
                        while(!cargaValida) {
                            System.out.println("Ingrese el TIPO DE CARGA (te, yerba o mate) del camion #" + fila + 1);
                            String carga = scanner.next().toLowerCase();
                            if (carga == "te" || carga == "té" || carga == "yerba" || carga == "mate") {
                                planilla[fila][columna] = carga;
                                cargaValida = true;
                            } else {
                                System.out.println("Carga invalida. Ingrese: te, yerba o mate");
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Ingrese la HORA DE EGRESO del camion #" + fila + 1);
                        planilla[fila][columna] = scanner.next().toLowerCase();
                        break;
                }
                
            }
            
        }
        
    }

    public int getCamionesTe() {
        int total = 0;

        for (int fila = 0; fila < totalCamiones; fila++) {
            for (int columna = 0; columna < cantidadDatosAPedir; columna++) {
                if (planilla[fila][columna] == "te" || planilla[fila][columna] == "té" ) { 
                    total++;
                }
            }

        }

        return total;
    }
    
    

}