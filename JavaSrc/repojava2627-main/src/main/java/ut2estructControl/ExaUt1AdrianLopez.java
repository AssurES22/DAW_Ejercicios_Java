///Importamos el Scanner
package ut2estructControl;

import java.util.Scanner;

///Creamos una clase publica
public class ExaUt1AdrianLopez {
	
	///Primero declaramos las constantes con los precios de las entradas: 
	
	 public static final double PRECIO_INFANTIL = 5.5;


	 public static final double PRECIO_JUVENIL = 8.2;


	 public static final double PRECIO_ADULTO = 12.5;


	 public static final double PRECIO_SENIOR = 6.0;
	 
	 
	///Creamos un método para calcular el importe total:
	/// Para ello, llamaremos a las variables de la clase main 
	
	public static double calcularImporte(int infantiles, int juveniles,


			 int adultos, int seniors) {
		
			///Calculamos el precio total, multiplicando el número de entradas por el precio de las constantes, y sumamos todo:

			double total = (infantiles*PRECIO_INFANTIL)+(juveniles*PRECIO_JUVENIL)+(adultos*PRECIO_ADULTO)+(seniors*PRECIO_SENIOR);

			 


			 // TODO: Implementar el cálculo del importe total 


			 return total;


			 }
	
	///Creamos el main

	public static void main(String[] args) {
		
		///Lanzamos el Scanner en el programa.
		/// 
		Scanner sc = new Scanner(System.in);
		
		///Imprimimos el texto y pedimos los datos necesarios.
		/// 
		System.out.println("Introduce la cantidad de entradas según su rango de edad: ");
		System.out.println("--------------------------------------------------------");
		System.out.println(" ");
		
		System.out.print("Número de entradas para menores de 12 años: ");
		int infantiles = sc.nextInt();
		
		System.out.print("Número de entradas para menores de 18 años: ");
		int juveniles = sc.nextInt();
		
		System.out.print("Número de entradas para menores de 65 años: ");
		int adultos = sc.nextInt();	
		
		System.out.print("Número de entradas para mayores de 65 años: ");
		int seniors = sc.nextInt();
		
		///llamamos al metodo calcularImporte e imprimimos el resultado.
		System.out.println("--- El precio total es de "+(calcularImporte(infantiles,juveniles,adultos,seniors))+ " euros. ---");
		sc.close();
	}

}


