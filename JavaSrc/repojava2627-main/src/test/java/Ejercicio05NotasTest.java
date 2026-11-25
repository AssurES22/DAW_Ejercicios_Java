
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import org.junit.jupiter.api.Test;

import ut2estructControl.Ejercicio05Notas;

class Ejercicio05NotasTest {

	@Test
	void testMainConVariasNotas() {
		// Array de notas en formato int
		int[] notasDePrueba = {-1, 11, 10, 9, 8, 6, 5, 4, 3, 2, 0};

		for (int nota : notasDePrueba) {
			// Convierte el número entero a String para pasarlo al Scanner
			System.setIn(new ByteArrayInputStream((nota + "\n").getBytes()));

			// Verifica que el método ejecuta sin lanzar ninguna excepción
			assertDoesNotThrow(() -> Ejercicio05Notas.main(new String[]{}), 
				"Fallo al procesar la nota: " + nota);
		}
	}

}