package logica;

public class Calculadora {
    
    public static ResultadoIMC calcularIMC(double peso, double altura) {
        double imc = peso / (altura * altura);
        IEstadoIMC estado;

        if (imc < 18.5) {
            estado = new BajoPeso();
        } else if (imc < 25.0) {
            estado = new PesoSaludable();
        } else if (imc < 30.0) {
            estado = new Sobrepeso();
        } else {
            estado = new Obesidad();
        }

        return new ResultadoIMC(imc, estado);
    }

}
