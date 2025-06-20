package modelo.clases;

import java.util.ArrayList;
import java.util.List;
import modelo.interfaces.IBibliotecaDAO;

public class DAOImplSQL implements IBibliotecaDAO {
    private static List<Libro> bibliotecaSQL = new ArrayList<>();
    private static int contador = 1;

    @Override
    public List<Libro> obtenerLibros() {
        return new ArrayList<>(bibliotecaSQL);
    }

    @Override
    public boolean agregarLibro(Libro libro) {
        libro.setId(contador++);
        return bibliotecaSQL.add(libro);
    }

    @Override
    public boolean eliminarLibro(int id) {
        for (int i = 0; i < bibliotecaSQL.size(); i++) {
        
            if( bibliotecaSQL.get(i).getId() == id) {
                bibliotecaSQL.remove(i);
                return true;
            }
        }
        return false;
    }
    
}
