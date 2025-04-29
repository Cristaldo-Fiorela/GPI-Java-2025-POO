package com.mycompany.tp1.poo_gpi2a;

import java.util.ArrayList;
import java.util.Scanner;

public class Censo {
    private ArrayList<String[]> censo;

    public Censo() {
    }

    public Censo(ArrayList<String[]> censo) {
        this.censo = censo;
    }
    
    public void setCenso() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los datos de cada persona. Ingrese 0 como DNI para terminar la carga.");

        censo = new ArrayList<>();
        boolean continuar = true;

        while (continuar) {
            String[] datosPersona = new String[3];

            System.out.println("Ingrese el DNI:");
            datosPersona[0] = scanner.next();

            if ("0".equals(datosPersona[0])) {
                continuar = false;
                continue;
            }

            System.out.println("Ingrese la EDAD:");
            datosPersona[1] = scanner.next();

            System.out.println("Ingrese el Sexo (F/M):");
            datosPersona[2] = scanner.next().toUpperCase();

            censo.add(datosPersona);
        }
        scanner.close();
    }

    
    public int getTotalCensado() {
        return censo.size();
    }
    
    public int getTotalGenero(char genero) {
        int total = 0;
        for (String[] persona : censo) {
            String sexo = persona[2];
            if(Character.toUpperCase(genero) == sexo.charAt(0)) {
                total++;
            }
        }
        return total;
    }
    
    /*
        informar:
            - porcentaje VARONES entre 16 y 65 respecto al TOTAL de varones
            - mostrar todos los datos de la persona con mayor edad
    */

}
