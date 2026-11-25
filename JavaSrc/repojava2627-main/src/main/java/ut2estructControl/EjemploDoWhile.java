package ut2estructControl;
import java.util.Scanner;

public class EjemploDoWhile{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce el límite para el bucle DO-WHILE: ");
        int limite = scanner.nextInt();
        
        System.out.println("--- Bucle DO-WHILE ---");
        int valor = 1;
        
        do {
            System.out.println("Valor actual: " + valor);
            valor++;
        } while (valor <= limite); // La condición se comprueba al final
        
        
        
        scanner.close();
    }
}