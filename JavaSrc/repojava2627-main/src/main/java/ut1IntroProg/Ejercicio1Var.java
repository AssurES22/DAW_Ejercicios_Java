package ut1IntroProg;

public class Ejercicio1Var {

	public static void main(String[] args) {
		/*
		 * comentario
		 */
		System.out.println(8);
		System.out.print(8);
		System.out.println("dfbsdkbfsdfjb");
		/*
		 * Las variables permiten almacenar información
		 * y siempre hay que indicar el tipo,
		 * es decir, si es una cadena, si es número, si es fecha etc
		 * 
		 * ¿Qué tipos hay?
		 * 
		 * - String --> Texto como "hola"
		 * - int --> Números enteros sin decimales
		 * - float --> Números con decimales
		 * - char --> Cáracteres individuales como "a", "b" van entre comillas simples
		 * - boolean --> almacena valores booleanos/viarios True/False
		 * 
		 * Las variables siempre en minúscula
		 * Las constantes siempre en mayúscula
		 */
		
		String nombre = "Ada Lovelace";
		System.out.println("La primera programadora " + nombre);
		
		/*
		 *Números
		 */
		 int unNum=15;
		 System.out.println(unNum);
		 //Puedo declarar la variable sin asignar valor y aignarlo después
		 int otroNum;
		 otroNum=18;
		 System.out.println(otroNum);
		 
		 final double PI = 3.141559;
		 System.out.println(PI);
	}

}
