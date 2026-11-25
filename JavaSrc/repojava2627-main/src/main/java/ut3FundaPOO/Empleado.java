package ut3FundaPOO;

public class Empleado {

	private int codEmpleado;
	private String NIF;
	private String nombre;
	private String apellidos;
	private String direccion;
	private double salario;
	
	public Empleado(int codEmpleado, String nIF, String nombre, String apellido, String direccion,double salario) {
		this.codEmpleado = codEmpleado;
		this.NIF = nIF;
		this.nombre = nombre;
		this.apellidos = apellido;
		this.direccion = direccion;
		this.salario = salario;
	
}

	public int getCodEmpleado() {
		return codEmpleado;
	}

	public void setCodEmpleado(int codEmpleado) {
		this.codEmpleado = codEmpleado;
	}

	public String getNIF() {
		return NIF;
	}

	public void setNIF(String nIF) {
		NIF = nIF;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empleado [codEmpleado=" + codEmpleado + ", NIF=" + NIF + ", nombre=" + nombre + ", apellidos="
				+ apellidos + ", direccion=" + direccion + ", salario=" + salario + "]";
	}
	
	
}
