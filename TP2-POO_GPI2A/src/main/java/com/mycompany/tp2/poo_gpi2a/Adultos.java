package com.mycompany.tp2.poo_gpi2a;

public class Adultos extends Pacientes implements IAdministracion, IClinicaMedica{
    private String PA, altura;
    private double peso;

    public Adultos() {
    }

    public Adultos(String PA, String altura, double peso, int DNI, String nombre, String obraSocial) {
        super(DNI, nombre, obraSocial);
        this.PA = PA;
        this.altura = altura;
        this.peso = peso;
    }
    
    @Override
    public void cobertura() {
        System.out.println("Cobertura Adulto");
    }

    @Override
    public double descuento() {
        return 0.10;
    }

    @Override
    public void rx() {
        System.out.println("rx adulto");
    }

    @Override
    public void vademecum() {
        System.out.println("vademecum adulto");
    }

    @Override
    public void sangre() {
        System.out.println("sangre adultos");
    }
}
