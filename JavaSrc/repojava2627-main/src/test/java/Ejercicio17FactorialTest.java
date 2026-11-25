import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ut2estructControl.Matematicas;

class Ejercicio17FactorialTest {

	@Test
    void factorialDeCeroDebeSerUno() {
        assertEquals(1, Matematicas.Factorial(0));
    }

    @Test
    void factorialDeUnoDebeSerUno() {
        assertEquals(1, Matematicas.Factorial(1));
    }

    @Test
    void factorialDeTresDebeSerSeis() {
        assertEquals(6, Matematicas.Factorial(3));
    }

    @Test
    void factorialDeCincoDebeSerCientoVeinte() {
        assertEquals(120, Matematicas.Factorial(5));
    }


}
