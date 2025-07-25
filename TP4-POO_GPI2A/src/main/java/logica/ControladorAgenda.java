package logica;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ControladorAgenda {
    private ArrayList<Persona> agenda;
    private int indiceActual;

    public ControladorAgenda() {
        this.agenda = new ArrayList<>();
        this.indiceActual = 0;
        agenda.add(new Persona("", "", "", ""));  
    }

    public ControladorAgenda(ArrayList<Persona> agenda, int indiceActual) {
        this.agenda = agenda;
        this.indiceActual = indiceActual;
    }
    
    public Persona getPersonaActual() {
        return agenda.get(indiceActual);
    }

    public void guardarContacto(String nombre, String apellido, String telefono, String direccion) {
        Persona persona = getPersonaActual();
        persona.setNombre(nombre != null ? nombre.trim() : "");
        persona.setApellido(apellido != null ? apellido.trim() : "");
        persona.setTelefono(telefono != null ? telefono.trim() : "");
        persona.setDireccion(direccion != null ? direccion.trim() : "");
    }

    public void siguienteContacto(String nombre, String apellido, String telefono, String direccion) {
        if (indiceActual == agenda.size() - 1) {
            agenda.add(new Persona("", "", "", ""));
        } 
        
        indiceActual++;
    }
    
    public void contactoAnterior(String nombre, String apellido, String telefono, String direccion) {        
        if (indiceActual > 0) {
            indiceActual--;
        }
    }
     
    public int getIndiceActual() {
        return indiceActual;
    }
    
    public void guardarAgendaEnArchivo(String nombreArchivo) {
    try {
        FileWriter archivo = new FileWriter(nombreArchivo);
        PrintWriter escritor = new PrintWriter(archivo);
        
        for (int i = 0; i < agenda.size(); i++) {
            Persona persona = agenda.get(i);
            
            if (!persona.getNombre().isEmpty() || !persona.getApellido().isEmpty() || !persona.getTelefono().isEmpty() || !persona.getDireccion().isEmpty()) {
                
                escritor.println("Contacto " + (i + 1) + ":");
                escritor.println("Nombre: " + persona.getNombre());
                escritor.println("Apellido: " + persona.getApellido());
                escritor.println("Teléfono: " + persona.getTelefono());
                escritor.println("Dirección: " + persona.getDireccion());
                escritor.println("-------------------");
            }
        }
        
        escritor.close();
        archivo.close();
        System.out.println("Agenda guardada exitosamente en: " + nombreArchivo);
        
    } catch (Exception err) {
        System.out.println("Error: " + err.getMessage());
    }
}

    

}
