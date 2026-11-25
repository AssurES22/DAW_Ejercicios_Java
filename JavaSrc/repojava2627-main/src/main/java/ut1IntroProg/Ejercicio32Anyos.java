package ut1IntroProg;

import java.util.Scanner;


public class Ejercicio32Anyos {
	
	public static int calcularEdadActual (int num ,int num2) {
		return num - num2;
	}

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Intoduce el año actual: ");
			
			int num = sc.nextInt();
			
			System.out.println("Introduce el año de tu nacimiento: ");
			
			int num2 = sc.nextInt();
			
			System.out.println("Tienes "+ calcularEdadActual(num,num2)+ " años");
		
		sc.close();

	}

}
