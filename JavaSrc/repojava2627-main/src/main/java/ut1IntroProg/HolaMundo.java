package ut1IntroProg;

import java.util.Scanner;

public class HolaMundo {

	public static void main(String[] args) {
		
		System.out.println("Introduce un número: ");
		Scanner sc = new Scanner(System.in);

		double num = sc.nextDouble();
		System.out.println("Introduce otro número: ");
		double num2 = sc.nextDouble();
		
		System.out.println("La suma de esos números da:  "+ (num+num2));
		System.out.println("La resta de esos números da:  "+ (num-num2));
		System.out.println("La multiplicación de esos números da:  "+ (num*num2));
		System.out.println("La división de esos números da:  "+ (num/num2));
		
		sc.close();
	}

}
