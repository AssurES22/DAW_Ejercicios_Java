package ut2estructControl;
import java.util.Scanner;

public class Ejercicio03Mayor {

	public static void main(String[] args) {
		//Escribe un programa que pida dos núcleos y muestre el mayor
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		int num1 = sc.nextInt();
		System.out.print("Introduce otro número: ");
		int num2 = sc.nextInt();
		
		if (num1 > num2) {
			System.out.println(num1 +" es mayor que "+num2);
			
		} else if (num1 == num2){
			System.out.println("Los números son iguales");
		} else {
			System.out.println(num1 + " es menor que "+num2);
		}
		sc.close();
	}

}
