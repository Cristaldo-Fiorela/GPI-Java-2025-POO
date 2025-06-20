package modelo;

import modelo.clases.DAOImplPostgreSQL;
import modelo.clases.DAOImplSQL;
import modelo.interfaces.IBibliotecaDAO;

public class ConexionFabrica {
    
    public static IBibliotecaDAO getConexion(String motor) {
        if(motor.equalsIgnoreCase("SQL")) {
            return new DAOImplSQL("SQL");
        } else if(motor.equalsIgnoreCase("POST")) {
            return new DAOImplPostgreSQL("POST");
        }
        return null;
    }
}
