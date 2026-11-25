package ut2estructControl;
import java.util.Scanner;

public class Ejercicio02Iguales {

	public static void main(String[] args) {
		// Escribe un programa que pida dos números y muestral usuario si son iguales
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int num1 = sc.nextInt();
		System.out.print("Introduce otro número: ");
		int num2 = sc.nextInt();
		
		if (num1 == num2) {
			System.out.println("Los dos números son iguales");
			
		} else {
			System.out.println("Los números "+ num1 +" y "+ num2 +" no son iguales");
		}
		sc.close();
		
	}

}
