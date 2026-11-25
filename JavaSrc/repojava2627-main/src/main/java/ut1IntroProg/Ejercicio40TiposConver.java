package ut1IntroProg;

public class Ejercicio40TiposConver {

	public static void main(String[] args) {
		
		byte byEdad = 30;
		double dAltura = 1.75; //ocupa 64
		char cInicial = 'A';
		boolean bEstudiante = true;
		int iNum = 3; //ocupa 32
		
		System.out.println("Edad: "+byEdad);
		System.out.println("Altura: "+dAltura);
		System.out.println("Inicial: "+cInicial);
		System.out.println("Estudiante: "+bEstudiante);
		
		double dNum = iNum;
		System.out.print("dNum: "+dNum);
		
		//si dNum vale 3.0 ¿Cúanto vale iNum2?
		//int iNum2 = dNum;
		
		//lo que si puedo hacer es cortarlo (quedarme con la parte entera)
		int iNum2 = (int)dNum;
		System.out.println("iNum2: "+iNum2);

	}

}
