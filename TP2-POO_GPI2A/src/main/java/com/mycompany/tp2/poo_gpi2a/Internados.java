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
    public void cobertura() {
        System.out.println("Cobertura Internado");
    }

    @Override
    public double descuento() {
        return 0.15;
    }

    @Override
    public void vademecum() {
        System.out.println("vademecum internado");
    }

    @Override
    public void tipoDieta() {
        System.out.println("dieta baja en sodio");
    }

    @Override
    public void rx() {
        System.out.println("rx internado");
    }

    @Override
    public void sangre() {
        System.out.println("sangre internados");
    }
    
}
