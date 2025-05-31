package logica;

public class ResultadoIMC {
    private double valorIMC;       
    private IEstadoIMC estadoIMC;

    public ResultadoIMC(double valorIMC, IEstadoIMC estadoIMC) {
        this.valorIMC = valorIMC;
        this.estadoIMC = estadoIMC;
    }

    public double getValorIMC() {
        return valorIMC;
    }

    public IEstadoIMC getEstadoIMC() {
        return estadoIMC;
    }

}
