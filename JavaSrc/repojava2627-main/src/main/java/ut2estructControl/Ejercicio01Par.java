package ut2estructControl;
import java.util.Scanner;

public class Ejercicio01Par {

	public static void main(String[] args) {
		//Uso de if
		//Programa que pide un número al usuario y muestra pro pantala si es par o impar
		Scanner sc = new Scanner(System.in);
		int num; //Número introducido por el usuairo
		System.out.print("introduce un número: ");
		num = sc.nextInt();
		if (num % 2 == 0){
			System.out.println("El número es par: ");
		} else {
			System.out.println("El número es impar: ");
		}
		
		sc.close();
			
		
			
	}

}
