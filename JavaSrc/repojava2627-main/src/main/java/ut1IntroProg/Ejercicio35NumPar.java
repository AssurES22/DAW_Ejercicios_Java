package ut1IntroProg;

import java.util.Scanner;

public class Ejercicio35NumPar {

	public static boolean esPar(int numero) {
		if (numero % 2 == 0) {
			return true;
		} else {
			return false;
			
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce un número: ");
		int numero = sc.nextInt();

		if (esPar(numero)) {
			System.out.println("Es par");
		} else {
			System.out.println("Es impar");
		}

	}

}