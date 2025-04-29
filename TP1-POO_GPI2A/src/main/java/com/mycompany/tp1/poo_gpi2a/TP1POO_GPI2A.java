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
        
        // EJERCICIO 4
        
        // Constructor con 30 camiones
        // GestorCamiones planilla = new GestorCamiones();
        
        // Constructor con cantidad de camiones personalizado.
        GestorCamiones planilla = new GestorCamiones(3);
        
        planilla.setPlanilla();
        System.out.println("La cantidad de camiones que transportan te es: " + planilla.getCamionesTe());
        planilla.getPlanilla();
    
        // EJERCICIO 5
        // Constructor con nro de clientes por default (5)
        Internet gestorInternet = new Internet();

        // Constructor con nro de clientes personalizado.
        //Internet gestorInternet = new Internet(2);
        
        gestorInternet.setClientes();
        gestorInternet.getInforme();

        
        // EJERCICIO 6
             
        // Constructor con nro de competidores default (12).
        //Carrera carrera = new Carrera();

        // Constructor con nro de competidores personalizado.
        Carrera carrera = new Carrera(2);
        
        carrera.setListaCompetidores();
        System.out.println(carrera.getMejorCompetidor());

         */
        
        //EJERCICIO 7
        Censo censo = new Censo();
        
        censo.setCenso();
        System.out.println("El total de personas censadas fue: " + censo.getTotalCensado());
        System.out.println("El total de hombres es: " + censo.getTotalGenero('M'));
        System.out.println("El total de mujeres es: " + censo.getTotalGenero('f'));
        System.out.println("El porcentaje de hombres entre 16 y 65 respecto a todo los hombres es: " + censo.getPorcentajeVarones() + "%");
    }

}
