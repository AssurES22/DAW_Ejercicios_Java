package ut2estructControl;
import java.util.Scanner;
public class Ejercicio07Salario {

	public static void main(String[] args) {
		// El progrma calcula el salario neto semanl de un trabajador en funcion da las horas trbajada y susu impuestos.
		// Las primeroas 35 horas tarifa normal, mas de 35 a 1.5 la trifa normal
		//impuestos: los primeros 500 euros libres de impuestos, los siguientes 400  25% de impuesos, los restantes 45% de impuestos, pide por pantalla
		//1. horas tabajadas esta semana, 2. precio hora tarifa normal, muestra por pantalla, salario bruto, impuestos, salario neto(salario - impuestos)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce las horas trabajadas esta semana: ");
		
		double horas = sc.nextDouble();
		
		System.out.print("Introduce el precio de la tarifa normal: ");
		
		double tarifa = sc.nextDouble();
		
		double bruto;
		
		double impuestos;
		
		if (horas > 35) {
			bruto = (tarifa * 35) + (((horas - 35) * tarifa) * 1.5);
		} else {
			bruto = horas * tarifa;
		}
		
		
		if (bruto <= 500) {
			impuestos = 0;
		}
		else if ((bruto - 500)<=400) {
			impuestos = (bruto - 500);
			impuestos = impuestos/4;
		}
		else {
		
			impuestos = 100 + ((bruto - 900)*0.45);
		}
		
		System.out.println("El salario bruto es "+ bruto + " con unos impuestos de "+ impuestos+" el salario neto es de "+(bruto-impuestos));
			

	}

}
