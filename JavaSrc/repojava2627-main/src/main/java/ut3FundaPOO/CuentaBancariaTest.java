package ut3FundaPOO;

public class CuentaBancariaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CuentaBancaria  Pedro = new CuentaBancaria("Adrian",1300.0);
		
		System.out.println(Pedro.toString());
		
		Pedro.consultarSaldo();
		Pedro.ingresar(500);
		System.out.println(Pedro.toString());
		Pedro.retirar(200);
		System.out.println(Pedro.toString());
		Pedro.getTitular();
		
		
	}

}
