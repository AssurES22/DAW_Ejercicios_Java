package ut2estructControl;
import java.util.Scanner;
public class Ejercicio08Granja {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("¿Cuantos animales tienes? ");
		int animales = sc.nextInt();
		System.out.print("¿Cuantos kg. de comida tienes? ");
		double kilos = sc.nextDouble();
		System.out.print("¿Cuantos kg. de comida como cada animal? ");
		double come = sc.nextDouble();
		
		if ((kilos/animales)< come) {
			System.out.println("No hay suficiente comida para los animales, por lo que solo podran comer, "+(kilos/animales) +" kg. cada uno.");
		}
		else {
			System.out.println("Los animales podrán comer la cantidad idonea de comida, "+ come +" kg.");
		}
		sc.close();
	}

}
