package ut2estructControl;
public class Ejercicio09For {

	public static void main(String[] args) {
		System.out.println("Cuenta ascendente:");
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println(); 

		System.out.println("Cuenta descendente:");
		for (int i = 10; i >= 0; i--) {
			System.out.print(i + " ");
		}
		System.out.println(); 

		System.out.println("Cuenta de 2 en 2:");
		for (int i = 0; i <= 20; i += 2) {
			System.out.print(i + " ");
		}
		System.out.println(); 

		System.out.println("Suma los primeros 100 numeros:");
		int suma = 0;
		for (int i = 1; i <= 100; i++) {
			suma += i;
			System.out.print(i + " ");
		}
		
		System.out.println("\nEl resultado total de la suma es: " + suma);
		/*
		 * Siguiente Nivel
		 */
		System.out.println("Matriz 3*3");
		for (int i=1; i<=3; i++) {
			for(int j=1;j<=3; j++) {
				System.out.println("("+i+", "+j+")");
			}
		
		
		
		
		}
		int i=5;
		int j=++i;
		int k=i++;
		System.out.println("i="+i);
		System.out.println("j="+j);
		System.out.println("k="+k);
		
		System.out.println("Vamos a pintar un triángulo alineado a la derecha");
		pintarTriangulo();
		
		
	}
	private static void pintarTriangulo() {
		String puntos = " ";
		for (int i=1; i<=6; i++) {
			System.out.print(" ");
			for(int j=1;j<=1; j++) {
				System.out.println(puntos);
				puntos = puntos+"*";
			}
			
		}
			
	}
	

}
