package com.mycompany.tp1.poo_gpi2a;

import java.util.ArrayList;
import java.util.Arrays;
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

            boolean cargaValida = false;
            
            while (!cargaValida) {
                System.out.println("Ingrese el Sexo (F/M):");
                datosPersona[2] = scanner.next().toUpperCase();
                
                if (datosPersona[2].equals("F") || datosPersona[2].equals("M")) {
                    cargaValida = true;
                } else {
                    System.out.println("Sexo inválido. Por favor, ingrese 'F' o 'M'.");
                }
            }

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
    
    public double getPorcentajeVarones() {
        ArrayList<String[]> varones = new ArrayList<>();
        int totalEnRango = 0;
        double porcentaje = 0;
        
        for (String[] persona : censo) {
            String sexo = persona[2];
           
            if (sexo.charAt(0) == 'M') {
              varones.add(persona);
            }
        }
        
        for (String[] varon : varones) {
            int edad = Integer.parseInt(varon[1]);
            if ( edad <= 65 && edad >= 16 ) {
                totalEnRango++;
            }
        }
        
        porcentaje = (double) totalEnRango / varones.size() * 100;
       
        return porcentaje;    
    }
    
    public void getMayoresEdad() {
        ArrayList<String[]> mayores = new ArrayList<>();
        
        for (String[] persona : censo) {
            int edad = Integer.parseInt(persona[1]);
           
            if (edad >= 18) {
              mayores.add(persona);
            }
        }

        for (String[] mayor : mayores) {
            System.out.println(Arrays.toString(mayor));
        }
    }
}
