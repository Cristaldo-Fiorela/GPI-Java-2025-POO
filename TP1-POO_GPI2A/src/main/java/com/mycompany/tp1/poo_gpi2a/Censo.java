package com.mycompany.tp1.poo_gpi2a;

import java.util.Scanner;

public class Censo {
    private String[][] censo;

    public Censo() {
    }

    public Censo(String[][] censo) {
        this.censo = censo;
    }
    
    public void setCenso() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese sus datos a continuacion");

    }
    
    
    public int getTotalCensado() {
        return censo.length;
    }
    
    /*
        DNI, EDAD, SEXO
        si se ingresa 0 debe parar de cargar datos en DNI
        informar:
            - total censado arr leng
            - cantidad varones
            - cantidad mujeres
            - porcentaje VARONES entre 16 y 65 respecto al TOTAL de varones
            - mostrar todos los datos de la persona con mayor edad
    */

}
