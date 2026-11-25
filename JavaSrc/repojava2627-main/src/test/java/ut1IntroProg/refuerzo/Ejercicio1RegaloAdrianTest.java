package ut1IntroProg.refuerzo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio1RegaloAdrianTest {

	@Test
	void testRepartoExacto() {
		assertEquals(15.0, Ejercicio1RegaloAdrian.calcularReparto(75.0, 5), 0.001);
	}

	@Test
	void testRepartoConDecimal() {
		assertEquals(16.5, Ejercicio1RegaloAdrian.calcularReparto(99.0, 6), 0.001);
	}

	@Test
	void testRepartoEntreDos() {
		assertEquals(25.0, Ejercicio1RegaloAdrian.calcularReparto(50.0, 2), 0.001);
	}

	@Test
	void testRepartoEntreUno() {
		assertEquals(100.0, Ejercicio1RegaloAdrian.calcularReparto(100.0, 1), 0.001);
	}

	@Test
	void testRepartoConCentimos() {
		assertEquals(12.5, Ejercicio1RegaloAdrian.calcularReparto(37.5, 3), 0.001);
	}

}
