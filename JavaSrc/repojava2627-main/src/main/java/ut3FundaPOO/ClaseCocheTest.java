package ut3FundaPOO;

public class ClaseCocheTest {

	public static void main(String[] args) {
	//crear coche
		String nombre ="Adrian";
	
		ClaseCoche Adrian = new ClaseCoche("Rojo",260,13.3);
		
		System.out.println("¿Cuál es el color del coche? " + Adrian.getsColor());
		System.out.println("¿Cuál es su velocidad máxima?" + Adrian.getiVelocidad());
		System.out.println("Cuál es el tamaño? "+ Adrian.getdTamanyo());
		
		///Cambiar un atributo sColor
		Adrian.setColor("Azul");
		
		System.out.println("¿Cuál es el color del coche? " + Adrian.getsColor());
		
		///Voy a ver todos los atributos, es necesario tener el toString en la clase
		System.out.println("Ver todos los atributos de coche de una "+Adrian.toString());
		
		//Métemos el metodo para modificar el atributo
		Adrian.acelerar();
		System.out.println(Adrian.toString());
		
		Adrian.pintar();
		System.out.println(Adrian.toString());
		
		Adrian.tunear();
		System.out.println(Adrian.toString());
	}
	
	

}
