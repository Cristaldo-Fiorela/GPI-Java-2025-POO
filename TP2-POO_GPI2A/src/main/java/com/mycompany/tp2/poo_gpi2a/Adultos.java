package com.mycompany.tp2.poo_gpi2a;

public class Adultos extends Pacientes implements IAdministracion, IClinicaMedica{
    private String PA, altura;
    private double peso;

    public Adultos() {
    }

    public Adultos(String PA, String altura, double peso) {
        this.PA = PA;
        this.altura = altura;
        this.peso = peso;
    }

    @Override
    public String cobertura() {
        return "Cobertura Adulto";
    }

    @Override
    public double descuento() {
        return 0.10;
    }

    @Override
    public String rx() {
        return "rx adulto";
    }

    @Override
    public String vademecum() {
        return "vademecum adulto";
    }

    @Override
    public char sangre() {
        return 'A';
    }
}
