package controlador;

import modelo.interfaces.IBibliotecaDAO;

public class BibliotecaController {
    private IBibliotecaDAO dao;

    public BibliotecaController(IBibliotecaDAO dao) {
        this.dao = dao;
    }
    
    
}
