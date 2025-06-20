package modelo.clases;

import java.util.ArrayList;
import java.util.List;
import modelo.interfaces.IBibliotecaDAO;

public class DAOImplPostgreSQL implements IBibliotecaDAO{
    private static List<Libro> bibliotecaPost = new ArrayList<>();
    private static int contador = 1;

    @Override
    public List<Libro> obtenerLibros() {
        return new ArrayList<>(bibliotecaPost);
    }

    @Override
    public boolean agregarLibro(Libro libro) {
        libro.setId(contador++);
        return bibliotecaPost.add(libro);
    }

    @Override
    public boolean eliminarLibro(int id) {
        for (int i = 0; i < bibliotecaPost.size(); i++) {
        
            if( bibliotecaPost.get(i).getId() == id) {
                bibliotecaPost.remove(i);
                return true;
            }
        }
        return false;
    }
}
