package ut2estructControl;
import java.util.Scanner;

public class Ejercicio14Primos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		int num = sc.nextInt();
		
		sc.close();
		
		System.out.println(pintarMenores(num));

		boolean bNumPrimo = comprobarPrimo(num);
		if (bNumPrimo) {
			System.out.println("El número " + num + " SI es primo");
		} else {
			System.out.println("El número " + num + " NO es primo");
		}
		
		sc.close();
	}
	
	public static String pintarMenores(int num) {
		int contador = 2;
		String resultado = "";
		int ext = 0;
		
		while (contador < ((num/2)+1)) {
			resultado = resultado + contador + " ";
			
			if (num % contador == 0) {
				resultado = resultado + " (Resto 0) ";
				ext = num%contador;
				break;
			} else {
				resultado = resultado + " (Resto "+ (num%contador)+ ") ";
				contador ++;
			}
		}
		return(resultado + " ");
	}

	private static boolean comprobarPrimo(int numero) {
		int contador = 2;
		boolean esPrimo = true;
		double raizNum = Math.sqrt(numero);
		while (contador < raizNum && esPrimo) {
			System.out.println("El resto de dividir " + numero + " y " + contador + " es " + (numero % contador));
			if (numero % contador == 0) {
				esPrimo = false;
			}
			contador++;
		}
		return esPrimo;
	}

}