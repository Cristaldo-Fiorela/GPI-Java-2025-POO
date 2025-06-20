package modelo.interfaces;

import java.util.List;
import modelo.clases.Libro;

public interface IBibliotecaDAO {
    List<Libro> obtenerLibros();
    boolean agregarLibro(Libro libro);
    boolean eliminarLibro(int id);
}
