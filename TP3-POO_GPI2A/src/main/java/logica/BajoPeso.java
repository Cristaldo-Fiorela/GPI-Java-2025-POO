package logica;

public class BajoPeso implements IEstadoIMC {

    @Override
    public String getConsejo() {
        return "Aumentá la ingesta calórica y consultá con un nutricionista.";
    }

    @Override
    public String getNombreEstado() {
        return "Bajo Peso";
    }
    
}
