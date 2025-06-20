package controlador;

import java.util.List;
import modelo.ConexionFabrica;
import modelo.clases.Libro;
import modelo.interfaces.IBibliotecaDAO;
import vista.GUI;

public class BibliotecaController {
    private GUI vista;
    private IBibliotecaDAO dao;
    private String tipoDB;

    public BibliotecaController(IBibliotecaDAO dao) {
        this.dao = dao;
    }
        
    public void setVista(GUI vista) {
        this.vista = vista;
    }
        
    public void actualizarTabla() {
        List<Libro> biblioteca = dao.obtenerLibros();
        vista.actualizarTabla(biblioteca);
    }
    
    public void cambiarBiblioteca(String tipoDB) {
        this.tipoDB = tipoDB;
        this.dao = ConexionFabrica.getConexion(tipoDB);
        actualizarTabla();
    }
    
    public void agregarLibro(String titulo, String autor) {
        if(!titulo.isEmpty() && !autor.isEmpty()) {
            Libro nuevoLibro =  new Libro(titulo, autor);
            
            if(dao.agregarLibro(nuevoLibro)) {
                actualizarTabla();
                vista.limpiarFormulario();
            }
        }
    }

    public boolean eliminarLibro(int id) {
        if(dao.eliminarLibro(id)) {
            actualizarTabla();
            vista.limpiarCampoEliminar();
            return true;
        }
        return false;
    }

}
