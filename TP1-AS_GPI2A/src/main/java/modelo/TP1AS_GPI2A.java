package modelo;

import controlador.BibliotecaController;
import modelo.interfaces.IBibliotecaDAO;
import vista.GUI;

public class TP1AS_GPI2A {

    public static void main(String[] args) {
        GUI biblioteca = new GUI();
        IBibliotecaDAO dao = ConexionFabrica.getConexion("SQL");
        BibliotecaController controlador = new BibliotecaController(dao);
       
        // conexion GUI y controlador
        biblioteca.setControlador(controlador);
        controlador.setVista(biblioteca);
        
        // config inicial GUI
        biblioteca.setVisible(true);
        biblioteca.setLocationRelativeTo(null);
        
        // config inicial tabla
        controlador.actualizarTabla();
    }
}
