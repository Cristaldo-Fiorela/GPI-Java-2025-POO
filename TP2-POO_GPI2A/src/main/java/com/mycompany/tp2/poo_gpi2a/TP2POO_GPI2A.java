package com.mycompany.tp2.poo_gpi2a;

public class TP2POO_GPI2A {

    public static void main(String[] args) {
        // Variables para utilizar
        double precio = 50000;
        
        // Instanciando clases creadas
        Adultos adulto = new Adultos();
        Pediatricos pediatrico = new Pediatricos();
        Internados internado = new Internados();
        
        // Adultos
        System.out.println("El precio es $" + precio);
        System.out.println("El descuento de adultos es: "+ (adulto.descuento() * 100) + "%");
        System.out.println("Con descuento de adultos queda: $"+ (precio - (precio * (adulto.descuento() / 100))));
        
        // Pediatricos
        System.out.println("El precio es $" + precio);
        System.out.println("El descuento de adultos es: "+ (pediatrico.descuento() * 100) + "%");
        System.out.println("Con descuento de adultos queda: $"+ (precio - (precio * (pediatrico.descuento() / 100))));
        
        // Internados
        System.out.println("El precio es $" + precio);
        System.out.println("El descuento de adultos es: "+ (internado.descuento() * 100) + "%");
        System.out.println("Con descuento de adultos queda: $"+ (precio - (precio * (internado.descuento() / 100))));

    }
}
