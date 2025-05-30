package logica;

public class PesoSaludable implements IEstadoIMC {
    @Override
    public String getConsejo() {
        return "Seguí manteniendo una dieta equilibrada y hacé ejercicio.";
    }

    @Override
    public String getNombreEstado() {
        return "Peso Saludable";
    }
}
