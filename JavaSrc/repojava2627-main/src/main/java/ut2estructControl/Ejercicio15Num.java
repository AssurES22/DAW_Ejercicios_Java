package ut2estructControl;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio15Num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Introduce un número: ");
			int num1 = sc.nextInt();
			System.out.println("Número leído: " + num1);
			
			System.out.print("Introduce otro número: ");
			int num2 = sc.nextInt();
			
			System.out.println("Resultado división: " + (num1 / num2));
		
		} catch (InputMismatchException ime) {
			System.err.println("Error al leer el número, debe ser un número entero.");
			ime.printStackTrace();
		} catch (ArithmeticException ae) {
			System.err.println("Error al leer el número, debe ser un número distinto de cero.");
			// ae.printStackTrace();
		} catch (Exception ex) {
			System.err.println("Error GENERAL: ");
			ex.printStackTrace();
		} finally {
			// Código que se ejecuta siempre falle o no falle.
			System.out.println("Este código siempre se ejecuta.");
			sc.close();
		}
	}

}