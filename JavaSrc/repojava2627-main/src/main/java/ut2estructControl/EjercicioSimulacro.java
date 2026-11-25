package ut2estructControl;
import java.util.InputMismatchException;
import java.util.Scanner;
public class EjercicioSimulacro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Declaramos las variables
		int num = 1;
		
		int contador = 0;
		
		int resultado = 0;
		
		int a =0 ;
		
		//Creamos un bucle con comprobacion de errores mediante Try
		
		try {
			while (a==0){
				System.out.print("Introduce el nº de km (0 = Terminar): ");
				
				
				num=sc.nextInt();
				
				if (num==0) {
					System.out.println("Terminado, el resultado es: "+ resultado);
					a=1;
				} else {

					contador +=(num*2);
					resultado += contador;
				}
				
				
				
			}
			
		} catch(InputMismatchException ime) { 
            System.out.println("Introduce un numero valido");

        }catch(Exception e) {
            System.out.println("Ha ocurrido un error");
        // cerramos el escaner para ahorrar recursos	
        } finally {
            sc.close();
        }
		
	}

}
