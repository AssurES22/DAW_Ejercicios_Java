package ut1IntroProg;

import java.util.Scanner;

public class EdadProx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce tu edad: ");
		int num = sc.nextInt();
		
		System.out.println("El año que viene tendrás " + (num+1)+ " años.");
		
		
		sc.close();


	}

}
