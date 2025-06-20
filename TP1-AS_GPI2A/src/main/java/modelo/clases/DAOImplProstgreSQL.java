package modelo.clases;

import java.util.ArrayList;
import java.util.List;
import modelo.interfaces.IBibliotecaDAO;

public class DAOImplProstgreSQL implements IBibliotecaDAO{
    private static List<Libro> bibliotecaProst = new ArrayList<>();
    private static int contador = 1;

    @Override
    public List<Libro> obtenerLibros() {
        return new ArrayList<>(bibliotecaProst);
    }

    @Override
    public boolean agregarLibro(Libro libro) {
        libro.setId(contador++);
        return bibliotecaProst.add(libro);
    }

    @Override
    public boolean eliminarLibro(int id) {
        for (int i = 0; i < bibliotecaProst.size(); i++) {
        
            if( bibliotecaProst.get(i).getId() == id) {
                bibliotecaProst.remove(i);
                return true;
            }
        }
        return false;
    }
    
    
}
