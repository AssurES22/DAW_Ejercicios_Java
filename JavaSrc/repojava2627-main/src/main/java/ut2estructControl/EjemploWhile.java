package ut2estructControl;
import java.util.Scanner;

public class EjemploWhile{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce el límite para el bucle WHILE: ");
        int limite = scanner.nextInt();
        
        System.out.println("--- Bucle WHILE ---");
        int contador = 1;
        while (contador <= limite) {
            System.out.println("Contador en: " + contador);
            contador++; // Incrementamos para evitar un bucle infinito
        }
        
        System.out.println("--- Cuenta Regresiva ---");
        contador = 10;
        while (contador >= limite) {
            System.out.println("Contador en: " + contador);
            contador--; // Incrementamos para evitar un bucle infinito
        }
        
        System.out.println("--- Pares del 1 al 100 ---");
        contador = 0;
        while (contador <=100) {
        	if (contador % 2 == 0){
        		System.out.print(contador +" ");
        		contador ++;
        	}else {
        		contador ++;
        		continue;
        		
        	}
        }
        System.out.println("--- ¿Es par? ---");
        System.out.println("Introduce el número: ");
        int iNum = scanner.nextInt();
        System.out.print("Es " + esPar(iNum));
        	
        scanner.close();
        
        System.out.println("--- Otro ejemplo ---");
        String sCad ="Hola ";
        contador=1;
        while (contador <=5) {
        	sCad+=contador;
        	System.out.println(sCad);
        	contador ++;
        }
    }
        private static boolean esPar(int iNum) {
        	
        
        		return (iNum % 2 == 0);
        	
        	
        	
        }
        
        
    
}