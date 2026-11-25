package ut1IntroProg.refuerzo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio3NumRevesAdrianTest {

	@Test
	void testNumeroCincoCifras() {
		assertEquals("54321",
		Ejercicio3NumRevesAdrian.invertirNumero(12345));
		}
		@Test
		void testNumeroCincoCifrasConCeros() {
		assertEquals("00120",
		Ejercicio3NumRevesAdrian.invertirNumero(2100));
		}
		
		@Test
		void testNumeroCuatroCifras() {
		assertEquals("43210",
		Ejercicio3NumRevesAdrian.invertirNumero(1234));
		}
		
		@Test
		void testNumeroTresCifras() {
		assertEquals("32100",
		Ejercicio3NumRevesAdrian.invertirNumero(123));
		}
		
		@Test
		void testNumeroDosCifras() {
		assertEquals("21000",
		Ejercicio3NumRevesAdrian.invertirNumero(12));
		}
		
		@Test
		void testNumeroUnaCifra() {
		assertEquals("10000",
		Ejercicio3NumRevesAdrian.invertirNumero(1));
		}
		
		@Test
		void testNumeroMaximo() {
		assertEquals("99999",
		Ejercicio3NumRevesAdrian.invertirNumero(99999));
		}
		
		@Test
		void testNumeroCero() {
		assertEquals("00000",
		Ejercicio3NumRevesAdrian.invertirNumero(0));
		}

	}

