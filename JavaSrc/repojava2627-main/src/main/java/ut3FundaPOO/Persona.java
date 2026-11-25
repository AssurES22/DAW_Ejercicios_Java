package ut3FundaPOO;

public class Persona {
	
	//atributos privados
	private String nombre;
	private int edad;
	private double estatura;
	
	//Genera el constructor
	
	public Persona(String paramNombre, int paramEdad, double paramEstatura) {
		
		this.nombre = paramNombre;
		this.edad = paramEdad;
		this.estatura = paramEstatura;
		
	}
	
	
	//Genera los getter y setter
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public double getEstatura() {
		return estatura;
	}


	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	
	//Genera el toString()
	
	
	

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", estatura=" + estatura + "]";
	}


	//Método que dice hola mi nombre encantado de conocerte
	public void saludar() {
		System.out.println("Hola mi nombre es "+ nombre + ", encantado de conocerte." );
		
	}
	//Metodo que añade un año a la persona
	public void cumple() {
		edad +=1;
		
	}
	
	//Método crecer
	public void crecer (double incremento) {
		estatura += incremento;
		
	}
}
