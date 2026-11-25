package ut1IntroProg;

import java.util.Scanner;

public class Ejercicio34Circunferencia {
	
	public static double calcularLongitud (double num) {
		return 2*Math.PI *num;
		
	public static double calcularArea (double num) {
		return Math.PI * Math.pow(num, 2);
				
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
			System.out.println("Introduce el radio de la circunferencia: ");
			double num = sc.nextDouble();
			
			System.out.println("La longitud de la circunferencia es de "+ calcularLongitud + " y el área es de "+ calcularArea));
		
		sc.close();
	}

}
