package ut2estructControl;
import java.util.Scanner;

public class Ejercicio04Ordenar {

	public static void main(String[] args) {
		//Pide 3 números y los muestrea ordenados de mayor a menor usando else if
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int num1 = sc.nextInt();
		System.out.print("Introduce otro número: ");
		int num2 = sc.nextInt();
		System.out.print("Introduce otro número: ");
		int num3 = sc.nextInt();
		
		if (num1 >= num2 && num1 >= num3) {
			System.out.print(num1 +" ");
			if (num2 == num3) {
				System.out.print(num2 + " " + num3);
			} else if (num2 >= num3) {
				System.out.print(num2 + " " + num3);
			} else {
				System.out.print(num3 + " "+ num2);
			}
			
			
		} else if (num2 >= num1 && num2 >= num3) {
			System.out.print(num2 + " ");
			if (num1 == num3) {
				System.out.print(num1 + " " + num3);
			} else if (num1 >= num3) {
				System.out.print(num1 + " " + num3);
			} else {
				System.out.print(num3 + " "+ num1);
			}
			
			
		} else if (num3 >= num1 && num3 >= num2) {
			System.out.print(num3+ " ");
			if (num2 == num1) {
				System.out.print(num2 + " " + num1);
			} else if (num1 >= num2) {
				System.out.print(num1 + " " + num2);
			} else {
				System.out.print(num2 + " "+ num1);
			}
		} else if(num1 == num2 && num2 == num3) {
			System.out.println("Son iguales");
		}
		
		sc.close();
	}

}
