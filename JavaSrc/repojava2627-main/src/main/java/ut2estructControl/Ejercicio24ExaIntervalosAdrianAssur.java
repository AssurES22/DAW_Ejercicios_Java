//Importamos las herramientas necesarias
package ut2estructControl;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio24ExaIntervalosAdrianAssur {
	
	 
	/**
	* Método suma
	* @param int inferior
	* @param int superior
	* @return int 
	* @author JAGD
	*/
	//Creamos el metodo de sume
	public static int suma(double inferior, double superior) {
	int suma = 0;

	while (inferior < superior) {
		suma += inferior;
		inferior ++;

	}
	suma += inferior;
	 
	return suma;
	}
	 
	/**
	* Método media
	* @param int inferior
	* @param int superior
	* @return double 
	* @author JAGD
	*/
	//Creamos el metodo de media
	public static double media(double inferior, double superior) {
	double media = 0;
	media = (inferior + superior)/2;
	return media;
	}
	 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int a = 1;
			String nombre ="";
			
			//Creamos un menú
			
			while (a == 1 || nombre == "--- Cerrando programa ---") {
				
				
				System.out.print("Introduce el número inferior: ");
				double inferior = sc.nextDouble();
				System.out.print("Introduce el número superior: ");
				double superior = sc.nextDouble();
				System.out.println("--- Menú ---");
				System.out.println("1.- Calcular suma intervalo.");
				System.out.println("2.- Calcular media intervalo.");
				System.out.println("0.- Salir.");
				System.out.print("¿Qué quieres hacer?" );
				int menu = sc.nextInt();
				
				
				nombre = switch (menu) {
			    case 1 -> "El resultado de la suma es: "+suma(inferior, superior);
			    case 2 -> "El resultado de la media es:"+ media(inferior, superior);
			    case 3 -> "--- Cerrando programa ---";
			    default -> "Debes introducir un numero válido";
			    
			    
			};
			//Imprimimos el resultado
			System.out.println("");
			System.out.println(nombre);
			System.out.println("");

			}} catch (InputMismatchException e) {
				//Comprobamos errores
				System.out.println("Error, debes introducir un número entero...");
				
				
			}finally {
				//Cerramos el Scanner
				sc.close();
			}
			
			
		
	}
	}
	 
	