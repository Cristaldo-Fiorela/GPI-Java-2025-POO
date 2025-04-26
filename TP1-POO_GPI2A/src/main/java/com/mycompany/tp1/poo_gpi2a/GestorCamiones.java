package com.mycompany.tp1.poo_gpi2a;

public class GestorCamiones {
    private int totalCamiones;
    private String[][] planilla;

    public GestorCamiones() {
        this.totalCamiones = 30;
        this.planilla = new String[totalCamiones][5];
    }

    public GestorCamiones(int totalCamiones) {
        this.totalCamiones = totalCamiones;
        this.planilla = new String[totalCamiones][5];
    }
    
    public void setDatos() {
        
    }
}
