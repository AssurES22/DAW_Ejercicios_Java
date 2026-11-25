package ut2estructControl;
import java.util.Scanner;
public class Ejercicio18EstadExamen {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*
		 * Método para las estadísticas de una clase
		 * con un bucle pide 10 notas por consola y al terminal muestra
		 * - Número de ceros
		 * - Número de aprobados
		 * - Número de suspensos
		 * - Media de aprobados
		 * - Media de los negativos
		 * Como simpre control de errores.
		 */
		String todas= "";
		int cont = 1;
		int cero = 0;
		
		while(cont <= 10) {
			System.out.print("Introduce una nota 0-10: ");
			cont ++;
			int nota = sc.nextInt(); 
			if (nota >10 || nota<0) {
				System.out.println("Error, Debe introducir un número comprendido entre 0 y 10");
			} else {
				System.out.println(" ");
				todas = todas + " " + nota;
				if(nota == 0) {

					cero++;
				}
			}
			
		}
		System.out.println(todas);
	}

}
