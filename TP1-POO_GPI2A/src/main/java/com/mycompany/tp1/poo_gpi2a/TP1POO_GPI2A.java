package com.mycompany.tp1.poo_gpi2a;

public class TP1POO_GPI2A {

    public static void main(String[] args) { 
        /*
        
        // EJERCICIO 1
        LIBRETA libreta = new LIBRETA();
        
        libreta.setNotas();
        System.out.println("La la mayor nota ingresada es: " + libreta.getMayorNota());
        
        // EJERCICIO 2
        libreta.getAlumnosAprobadosDesaprobados();

        // EJERCICIO 3
        PRODUCTOS productos = new PRODUCTOS();
        
        productos.setProductos();
        System.out.println("El total de los productos ingresados es: $" + productos.getTotal());
        System.out.println("El total de los productos MAYORES a $1000 es: " + productos.getMayorAMil());
        
       */
        
        // EJERCICIO 4
        
        // Constructor con 30 camiones
        // GestorCamiones planilla = new GestorCamiones();
        
        // Constructor con cantidad de camiones personalizado.
        GestorCamiones planilla = new GestorCamiones(3);
        
        planilla.setPlanilla();
        System.out.println("La cantidad de camiones que transportan te es: " + planilla.getCamionesTe());
        planilla.getPlanilla();
    }

}
