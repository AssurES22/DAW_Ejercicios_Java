package ut1IntroProg.refuerzo;

import java.util.Scanner;

public class Ejercicio2DescuentoAdrian {

	/*
	 * Una tienda quiere premiar a sus clientes con un descuento especial. Escribe
	 * un programa en Java que solicite al usuario el importe total de una compra.
	 * Si el importe es superior a 100 €, se aplicará un descuento de 10 €. En caso
	 * contrario, el precio permanecerá sin cambios. El programa deberá mostrar el
	 * precio final que debe pagar el cliente. Importante: El cálculo del precio
	 * final debe realizarse utilizando el operador ternario (? :).
	 */

	/**
	 * Calcula el precio final aplicando un descuento de 10 € si el importe supera
	 * los 100 €.
	 *
	 * @param importe Importe de la compra
	 * @return Precio final
	 */
	public static double calcularPrecioFinal(double importe) {
		
		double descuento=importe-10;
		
		double precioDescuento= importe > 100 ? (importe=importe-10) : importe;
		
		return precioDescuento;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el importe total de la compra: ");
		
		double importe = sc.nextDouble();
		
		double descuento=importe-10;
		
		double precioDescuento= importe > 100 ? (importe=importe-10) : importe;
		
		System.out.println(precioDescuento);
		
		
		
	}

}
