package ut1IntroProg;

import java.util.Scanner;

public class Ejercicio41MayorMenor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		int n1,n2,mayor,menor;
		System.out.print("Introduce el 1er num: ");
		n1 = sc.nextInt();
		System.out.print("Introduce el 2º num: ");
		n2 = sc.nextInt();
		//ConOperador ternario
		
		mayor = n1 > n2 ? n1 : n2;
		menor = n2 > n1 ? n1 : n2;
		
		System.out.println("El número mayor es: "+mayor);
		System.out.println("El número menor es " +menor);
		sc.close();
	}

}
