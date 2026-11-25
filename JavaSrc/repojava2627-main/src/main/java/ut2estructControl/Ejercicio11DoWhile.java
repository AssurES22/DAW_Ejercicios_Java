package ut2estructControl;
import java.util.Scanner;

public class Ejercicio11DoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número: ");

		int num = 1;
		int may = 0;
		do {
			num = sc.nextInt();
			System.out.println("No es 0");
			
			if (may < num) {
				may = num;
			}
		}

		while (num != 0);

		System.out.println("El numero mas grande es " + may);

		// Programa que pide un número por consola hasta que se introduzca un 0.
		// Cuando termina muestra el mayor.
		sc.close();
	}

}
