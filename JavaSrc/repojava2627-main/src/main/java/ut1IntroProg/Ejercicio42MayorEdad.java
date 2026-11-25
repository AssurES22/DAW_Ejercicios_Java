package ut1IntroProg;

import java.util.Scanner;

public class Ejercicio42MayorEdad {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		System.out.println("Escribe tu año de nacimiento: ");
		int iEdad = sc.nextInt();
		System.out.println("Escribe el año actual: ");
		int iAño = sc.nextInt();
		
		String mayor = (iAño - iEdad)> 17 ? "Es mayor de edad" : "Es menor de edad";
		System.out.print(mayor);
		
		

	}

}
