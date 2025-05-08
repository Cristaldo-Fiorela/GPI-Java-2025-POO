package com.mycompany.tp2.poo_gpi2a;

public class Internados extends Pacientes implements IAdministracion, INutricion, IClinicaMedica{
    private int habitacion;
    private String PA, rh;

    public Internados() {
    }

    public Internados(int habitacion, String PA, String rh, int DNI, String nombre, String obraSocial) {
        super(DNI, nombre, obraSocial);
        this.habitacion = habitacion;
        this.PA = PA;
        this.rh = rh;
    }

    @Override
    public String cobertura() {
        return "Cobertura Internado";
    }

    @Override
    public double descuento() {
        return 0.15;
    }

    @Override
    public String vademecum() {
        return "vademecum internado";
    }

    @Override
    public String tipoDieta() {
        return "dieta baja en sodio";
    }

    @Override
    public String rx() {
        return "rx internado";
    }

    @Override
    public char sangre() {
        return 'B';
    }
    
}
