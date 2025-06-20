package modelo.clases;

import modelo.interfaces.IConexion;

public class ConexionPostgreSQL implements IConexion {

    @Override
    public void conectar() {
        System.out.println("Conectado a PostgreSQL");
    }

    @Override
    public void desconectar() {
        System.out.println("Desconectado a PostgreSQL");
    }   
}
