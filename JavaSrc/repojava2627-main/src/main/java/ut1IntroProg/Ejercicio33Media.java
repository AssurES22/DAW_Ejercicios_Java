package ut1IntroProg;

import java.util.Scanner;


public class Ejercicio33Media {
	
	public static double calcularNotaMedia (double num ,double num2) {
		return (num + num2)/2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
			System.out.println("Introduce la primera nota: ");
			double num = sc.nextDouble();
			
			System.out.println("Introduce la segunda nota: ");
			double num2 = sc.nextDouble();
			
			System.out.println("La nota media es: "+ calcularNotaMedia(num, num2));
		
		sc.close();

	}

}
