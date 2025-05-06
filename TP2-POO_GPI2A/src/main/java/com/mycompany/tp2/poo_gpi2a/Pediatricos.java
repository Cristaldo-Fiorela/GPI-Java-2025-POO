package com.mycompany.tp2.poo_gpi2a;

public class Pediatricos extends Pacientes implements IAdministracion, INutricion {
    private double peso;
    private int celular;
    private String tutor;

    public Pediatricos() {
    }
    
    public Pediatricos(double peso, int celular, String tutor) {
        this.peso = peso;
        this.celular = celular;
        this.tutor = tutor;
    }

    @Override
    public String cobertura() {
        return "Cobertura pediatrica";
    }

    @Override
    public double descuento() {
        return 0.20;
    }

    @Override
    public String tipoDieta() {
        return "dieta blanda infantil, no carne molida";
    }

    @Override
    public String vademecum() {
        return "vademecum pediatrico";
    }

}
