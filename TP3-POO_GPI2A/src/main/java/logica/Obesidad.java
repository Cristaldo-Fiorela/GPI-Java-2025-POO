package logica;

public class Obesidad implements IEstadoIMC {
    @Override
    public String getConsejo() {
        return "Consultar con nutricionista.";
    }

    @Override
    public String getNombreEstado() {
        return "Obesidad";
    }
}
