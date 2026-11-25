package ut3FundaPOO;

public class PersonaTest {

	public static void main(String[] args) {
		Persona Pedro = new Persona("Pedro",42,1.73);
		
		System.out.println(Pedro.toString());
		
		Pedro.cumple();
		System.out.println(Pedro.toString());
		
		Pedro.crecer(0.03);
		System.out.println(Pedro.toString());
	}

}
