package ut2estructControl;
import java.util.Scanner;
public class PeñaSoria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("¿Que recaudacion hiciste el ");
		int mar = 0; int mie = 0; int jue = 0; int vie = 0; int sab = 0; int dom = 0; String max = "";String min =""; int maximo= 0; int minimo = 9999999;
		
		for (int dia =1; dia <=7;dia++)
			switch (dia) {
					
					case 1 :
						System.out.println("Martes? :");
						mar = sc.nextInt();
						max = "Martes";
						min = "Martes";
						maximo = mar;
						minimo = mar;
						break;
					case 2 :
						System.out.println("¿Que recaudacion hiciste el Miércoles? :");
						mie = sc.nextInt();
						if (mie > maximo) {max="Miercoles";maximo = mie;} 
						if (mie < maximo) {min="Miercoles";minimo = mie;}
						break;
					case 3 :
						System.out.println("¿Que recaudacion hiciste el Jueves? :");
						jue = sc.nextInt();
						if (jue > maximo) {max="Jueves";maximo = jue;} 
						if (jue < maximo) {min="Jueves";minimo = jue;}
						break;
					case 4 :
						System.out.println("¿Que recaudacion hiciste el Viernes? :");
						vie = sc.nextInt();
						if (vie > maximo) {max="Viernes";maximo = vie;} 
						if (vie < maximo) {min="Viernes";minimo = vie;}
						break;
					case 5 :
						System.out.println("¿Que recaudacion hiciste el Sábado? :");
						sab = sc.nextInt();
						if (sab > maximo) {max="Sábado";maximo = sab;} 
						if (sab < maximo) {min="Sábado";minimo = sab;}
						break;
					case 6 :
						System.out.println("¿Que recaudacion hiciste el Domingo? :");
						dom = sc.nextInt();
						if (dom > maximo) {max="Domingo";maximo = dom;} 
						if (dom < maximo) {min="Domingo";minimo = dom;}
						break;
					default:
						System.out.println("El dia donde mas se gasta es " + max);
						System.out.println("El día donde menos se gasta es " + min);
					}
		String dia = "LUNES";

		int resultado = switch (dia) {
		    case "LUNES" -> {
		        System.out.println("¡Ánimo con la semana!");
		        int letras = 6;
		        yield letras; // Devuelve este valor
		    }
		    case "VIERNES" -> {
		        System.out.println("¡Ya casi es fin de semana!");
		        yield 7;
		    }
		    default -> {
		        System.out.println("Día normal");
		        yield 0;
		    }
		};
					sc.close();
				}

}
