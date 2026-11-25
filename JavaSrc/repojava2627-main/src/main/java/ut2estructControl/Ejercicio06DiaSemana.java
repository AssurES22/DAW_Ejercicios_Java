package ut2estructControl;
import java.util.Scanner;
public class Ejercicio06DiaSemana {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Programa que pide un número del 1 al 7 y dice el dia que es
		System.out.print("¿Qué dia de la semana es?");
		int dia = sc.nextInt();
		
		switch (dia) {
		
		case 1 :
			System.out.println("Lunes");
			break;
		case 2 :
			System.out.println("Martes");
			break;
		case 3 :
			System.out.println("Miércoles");
			break;
		case 4 :
			System.out.println("Jueves");
			break;
		case 5 :
			System.out.println("Viernes");
			break;
		case 6 :
			System.out.println("Sábado");
			break;
		case 7 :
			System.out.println("Domingo");
			break;
		default:
			System.out.println("--- Introduce un número entre 1 y 7 ---");
		}
		sc.close();

	}

}
