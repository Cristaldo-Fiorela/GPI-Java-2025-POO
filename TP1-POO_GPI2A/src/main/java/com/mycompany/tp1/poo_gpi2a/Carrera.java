package com.mycompany.tp1.poo_gpi2a;

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
    
    
}
