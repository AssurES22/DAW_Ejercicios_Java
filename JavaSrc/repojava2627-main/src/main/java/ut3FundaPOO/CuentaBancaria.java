package ut3FundaPOO;

public class CuentaBancaria {
	
	private String sTitulo;
	private double dSaldo;
	
	public CuentaBancaria(String paramTitulo, double paramSaldo) {
		this.sTitulo = paramTitulo;
		this.dSaldo = paramSaldo;
	}

	public String getsTitulo() {
		return sTitulo;
	}

	public void setsTitulo(String sTitulo) {
		this.sTitulo = sTitulo;
	}

	public double getdSaldo() {
		return dSaldo;
	}

	public void setdSaldo(double dSaldo) {
		this.dSaldo = dSaldo;
	}

	@Override
	public String toString() {
		return "El saldo actual " + sTitulo + " es: " + dSaldo;
	}
	
	public void ingresar (double n) {
		dSaldo += n;
	}
	
	public void retirar (double s) {
		if (dSaldo > 0) {
			if ((dSaldo - s)>0) {
				dSaldo -= s;
			} else {
				System.out.println("Saldo insuficiente");
			}
		
		}else {
			System.out.println("Sin fondos");
		}
		
	}
	
	public void consultarSaldo() {
		System.out.println("Su saldo actual es: "+ dSaldo);
	}
	
	public void getTitular() {
		System.out.println("El nombre del titular es: "+ sTitulo);
	}
}
