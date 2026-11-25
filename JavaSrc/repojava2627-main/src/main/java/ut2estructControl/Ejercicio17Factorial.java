package ut2estructControl;
import java.util.Scanner;

public class Ejercicio17Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Introduce un número: ");
			
			int num = sc.nextInt();
			
			System.out.println("El factorial es: "+Factorial(num));
		} catch (Exception ex){
			System.out.println("Error, debes introducir un número entero.");
			
		}
		
		finally {
			sc.close();
		}
		
	}
	public static int Factorial(int num) {
		
		int b= 1;
		
		for (int i = 1; i <= num; i++) {

			b *= i;
			
		
		}
		return(b);
		
		
	}
}

