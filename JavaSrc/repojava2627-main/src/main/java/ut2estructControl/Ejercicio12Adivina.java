package ut2estructControl;
import java.util.Scanner;

import java.util.Random;

public class Ejercicio12Adivina {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Juego de la adivinanza, generamos un número aleatoria entre uno y cien.
		//Pide un número por consola y debe eejcutar el bucle hasta que se adivine.
		//Pista: Siempre dice si el número secreto es mayor o menor que el introducido.
		Random random = new Random();
		final int ale = random.nextInt(100) + 1;
		int num = -1;
		
		do {
			System.out.print("Adivina el número: ");
			num = sc.nextInt();
			
			if (num<ale) {
				System.out.println("Es mayor");
			}else if (num==ale){
				System.out.println("Correcto");
				break;
			} else {
				System.out.println("Es menor");
			}
			
			
			
		} while (num!=ale);
		

	}
	

}
