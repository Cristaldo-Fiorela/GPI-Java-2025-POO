package com.mycompany.practica_txt;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PRACTICA_TXT {

    public static void main(String[] args) throws IOException {
        FileWriter archivo = null;
        PrintWriter escritor;
        
        try{
            archivo = new FileWriter("C:\\Users\\Fio\\Documents\\INCADE\\GPI-Java-2025-POO\\PRACTICA_TXT\\ARCHIVOS_GENERADOS\\txt_generado.txt");
            escritor = new PrintWriter(archivo);
            
            escritor.println("Test #1");
            escritor.print("HOLAAAAAAAAAAAAAAAAAAAAAAAA");
        } catch (Exception err) {
            System.out.println("Error: " + err.getMessage());
        } finally {
            archivo.close();
        }
    }
}
