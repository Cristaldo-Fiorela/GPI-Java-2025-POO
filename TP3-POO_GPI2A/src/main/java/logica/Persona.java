package logica;

public class Persona {
    private int edad;
    private double altura;

    public Persona() {
    }

    public Persona(int edad, double altura) {
        this.edad = edad;
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}
