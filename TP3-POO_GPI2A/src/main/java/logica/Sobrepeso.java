package logica;

public class Sobrepeso implements IEstadoIMC {
    @Override
    public String getConsejo() {
        return "Hay que implementar una dieta equilibrada y hacer ejercicio. Consultar con nutricionista.";
    }

    @Override
    public String getNombreEstado() {
        return "Soprepeso";
    }
}
