package ut2estructControl;

public class Ejercicio13Cadenas {

	public static void main(String[] args) {
		//Ejemplos con cadenas
		String str1 = "name";
		String str2 = "name";
		String str3 = new String("name");
		String str4 = "Name";
		System.out.println(str1.equals(str2));
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str3));
		System.out.println(str3 == str1);
		System.out.println(str4 == str1);

	}

}
