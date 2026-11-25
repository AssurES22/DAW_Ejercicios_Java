package ut1IntroProg;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CamposFutbolTest {

	@Test
	void testCalcular() {
		// Asumiendo que el método Calcular devuelve void o procesa los datos correctamente
		assertDoesNotThrow(() -> CamposFutbol.Calcular(105, 68, 3), 
			"El método no debería lanzar ninguna excepción con valores válidos.");
	}

}
