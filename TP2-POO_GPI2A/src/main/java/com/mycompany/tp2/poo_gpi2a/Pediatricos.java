package com.mycompany.tp2.poo_gpi2a;

public class Pediatricos extends Pacientes implements IAdministracion, INutricion {
    private double peso;
    private int celular;
    private String tutor;

    public Pediatricos() {
    }

    public Pediatricos(double peso, int celular, String tutor, int DNI, String nombre, String obraSocial) {
        super(DNI, nombre, obraSocial);
        this.peso = peso;
        this.celular = celular;
        this.tutor = tutor;
    }

    @Override
    public void cobertura() {
        System.out.println("Cobertura pediatrica");
    }

    @Override
    public double descuento() {
        return 0.20;
    }

    @Override
    public void tipoDieta() {
        System.out.println("dieta blanda infantil, no carne molida");
    }

    @Override
    public void vademecum() {
        System.out.println("vademecum pediatrico");
    }

}
