package ut2estructControl;
import java.util.Scanner; // Importamos la clase Scanner para leer datos

public class EjemploFor{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("¿Hasta qué número quieres contar con el bucle FOR? ");
        int limite = scanner.nextInt(); // Leemos el número ingresado por el usuario
        
        System.out.println("--- Bucle FOR ---");
        for (int i = 1; i <= limite; i++) {
            System.out.println("Repetición número: " + i);
        }
        
        scanner.close(); // Cerramos el scanner
    }
}