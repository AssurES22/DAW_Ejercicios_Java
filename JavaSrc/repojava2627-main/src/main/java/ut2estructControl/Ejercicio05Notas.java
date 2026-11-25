package ut2estructControl;
import java.util.Scanner;
public class Ejercicio05Notas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Pide un número
		//Valida esté entre 0 y 10
		//de 0 a 3 muy deficioente, 3 a 5 insuficionete, 5 a 6 suficiente, 6 a 9 notable, 9 a 10 sobresaliente
		System.out.print("Introduce tu nota: ");
		double nota = sc.nextDouble();
		if (nota > 10 || nota <0) {
			System.out.println("Introduce un numero comprenido entre 0 y 10.");
		}else if (nota >= 9) {
			System.out.println("Sobresaliente");
		} else if (nota >= 6) {
			System.out.println("Notable");
		} else if (nota >= 5) {
			System.out.println("Suficiente");
		} else if (nota >= 3) {
			System.out.println("Insuficiente");
		} else {
			System.out.println("Muy insuficiente");
		}
			
	}

}
