package ut1IntroProg.refuerzo;

import java.util.Scanner;
/*
 * Un grupo de amigos quiere comprar un regalo de cumpleaños y repartir su coste entre todos los participantes.

Escribe un programa en Java que solicite al usuario:
	El precio total del regalo (en euros).
	El número de amigos que van a contribuir a la compra.
	Cada amigo deberá aportar una cantidad exacta de euros 
	El programa deberá mostrar:
	Cuántos euros debe pagar cada amigo.
 * */

public class Ejercicio1RegaloAdrian {
	
	
	
	/**
	 * 
	 * @param precioRegalo
	 * @param numAmigos
	 * @return String
	 */
	public static double calcularReparto(double precioRegalo, int numAmigos) {
		double dPagaCadaUno;
		
		
		return dPagaCadaUno=precioRegalo / numAmigos;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		
		System.out.println("Introduce e precio total del regalo en euros: ");
		
		double precioRegalo = sc.nextDouble();
		
		System.out.println("Introduce el número de amigos que participaran en la compra del regalo: ");
		
		int numAmigos = sc.nextInt();
		
		double dPagaCadaUno = precioRegalo/numAmigos;
		
		System.out.println("Cada alumno pagara: "+ dPagaCadaUno);
		
		sc.close();

		 
	}
}
