package com.mycompany.tp1.poo_gpi2a;

public class TP1POO_GPI2A {

    public static void main(String[] args) {        
        // EJERCICIO 1
        LIBRETA libreta = new LIBRETA();
        
        libreta.setNotas();
        System.out.println("La la mayor nota ingresada es: " + libreta.getMayorNota());
        
        // EJERCICIO 2
        libreta.getAlumnosAprobadosDesaprobados();

    }

}
