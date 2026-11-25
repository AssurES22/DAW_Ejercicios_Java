package ut1IntroProg.refuerzo;

import java.util.Scanner;

public class Ejercicio3NumRevesAdrian {

    /**
     * Realiza un programa en Java que solicite al usuario un número entero comprendido entre 0 y 99.999.
	A continuación, el programa deberá descomponer el número en sus distintas cifras 
	(unidades, decenas, centenas, unidades de millar y decenas de millar) 
	y mostrarlo escrito al revés, sin utilizar métodos específicos para invertir cadenas.
	Pista: Piensa qué operaciones aritméticas te permiten:
		Obtener la última cifra de un número.
		Eliminar esa última cifra para seguir trabajando con las restantes.
     */
    public static int invertirNumero(int num) {
        int iNumInvertido=0;
        
        int decenaMillar =(num/10000);     
        
        int millar = (num/1000)-(decenaMillar*10);        
        
        int centena = (num/100)-(decenaMillar*100)-(millar*10);        
        
        int decena = (num/10)-(decenaMillar*1000)-(millar*100)-(centena*10);        
        
        int unidad = (num)-(decenaMillar*10000)-(millar*1000)-(centena*100)-(decena*10);
        
        iNumInvertido=(unidad*10000)+(decena*1000)+(centena*100)+(millar*10)+(decenaMillar);
        
    	return (iNumInvertido);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un número entre 0 y 99999: ");
        int num = sc.nextInt();
        
        int iNumInvertido=0;
        
        System.out.println(invertirNumero(num));

        sc.close();
    }
}