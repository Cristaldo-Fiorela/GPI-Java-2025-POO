package com.mycompany.tp2.poo_gpi2a;

public abstract class Pacientes {
    protected int DNI;
    protected String nombre, obraSocial;

    protected Pacientes() {
    }

    protected Pacientes(int DNI, String nombre, String obraSocial) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.obraSocial = obraSocial;
    }

    protected void setDNI(int DNI) {
        this.DNI = DNI;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected void setObraSocial(String obraSocial) {
        this.obraSocial = obraSocial;
    }

    protected int getDNI() {
        return DNI;
    }

    protected String getNombre() {
        return nombre;
    }

    protected String getObraSocial() {
        return obraSocial;
    }

}
