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
    }
}
