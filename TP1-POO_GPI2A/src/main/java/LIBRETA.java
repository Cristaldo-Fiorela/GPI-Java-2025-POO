import java.util.Scanner;

public class LIBRETA {
    Scanner scanner = new Scanner(System.in);
    private int A_CARGAR;
    private float[] NOTAS;
    private float MAYOR = 0;
    // EJERCICIO 2
    private int APROBADOS = 0;
    private int DESAPROBADOS = 0;
    
    public void setNotas() {
        System.out.println("Ingrese la cantidad de notas a cargar: ");
        A_CARGAR = scanner.nextInt();
        
        NOTAS = new float[A_CARGAR];
        
        for (int i = 0; i < A_CARGAR; i++) {
            float nota = -1;
            
            while (nota < 0 || nota > 10) {
                System.out.println("Ingrese la siguiente nota a cargar:");
                nota = scanner.nextFloat();

                if (nota < 0 || nota > 10) {
                    System.out.println("Nota invalida. Debe estar entre 0 y 10.");
                }
            }
            
            NOTAS[i] = nota;
        }
    }
    
    public void getMayorNota() {
        
        if (NOTAS.length > 0) {         
            for (float nota : NOTAS) {
                if (nota > MAYOR) {
                    MAYOR = nota;
                }
            }  
        } else  {
            System.out.println("No hay notas existentes, ejecute el metodo setNotas()");
        }
        
        System.out.println("La mayor nota cargada es: " + MAYOR);
    }
    
    public void getAlumnosEstatus() {
        for (float nota : NOTAS) {
            if (nota >= 6) {
                APROBADOS += 1;
            } else {
                DESAPROBADOS += 1;
            }
        }
        System.out.println("Hay " + APROBADOS + " aprobados y " + DESAPROBADOS + " desaprobados");

    }
    
}
