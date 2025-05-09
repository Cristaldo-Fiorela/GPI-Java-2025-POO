package com.mycompany.tp1.poo_gpi2a;

import java.util.Scanner;

public class LIBRETA {
    private Scanner scanner = new Scanner(System.in);
    private int A_CARGAR;
    private float[] NOTAS;

    public LIBRETA() {
    }

    public LIBRETA(float[] NOTAS) {
        this.A_CARGAR = NOTAS.length;
        this.NOTAS = NOTAS;
    }
    
    public void setNotas() {   
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
    }
    
    public float getMayorNota() {
       float MAYOR = 0;

        for (float nota : NOTAS) {
                if (nota > MAYOR) {
                    MAYOR = nota;
                }
            }  
        
        return MAYOR;
    }
    
    public void getAlumnosAprobadosDesaprobados() {
             
       if (NOTAS.length == 0) {
            throw new IllegalStateException("No hay notas existentes, ejecute el metodo setNotas() para realizar su carga");
        }
         
        int APROBADOS = 0;
        int DESAPROBADOS = 0;

        for (float nota : NOTAS) {
            if (nota >= 6) {
                APROBADOS += 1;
            } else {
                DESAPROBADOS += 1;
            }
        }
        System.out.println("Hay " + APROBADOS + " aprobados y " + DESAPROBADOS + " desaprobados");

    }

}
