package modelo.clases;

import modelo.interfaces.IConexion;

public class ConexionSQL implements IConexion {

    @Override
    public void conectar() {
        System.out.println("Conectado a SQL");
    }

    @Override
    public void desconectar() {
        System.out.println("Desconectado de SQL");
    }
    
}
