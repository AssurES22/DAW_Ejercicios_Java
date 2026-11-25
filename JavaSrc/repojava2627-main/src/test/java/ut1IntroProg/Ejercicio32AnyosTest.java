package ut1IntroProg;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Ejercicio32AnyosTest {

    @Test
    void testEdad18() {
        assertEquals(18,
                Ejercicio32Anyos.calcularEdadActual(2008, 2026));
    }

    @Test
    void testEdad0() {
        assertEquals(0,
                Ejercicio32Anyos.calcularEdadActual(2026, 2026));
    }

    @Test
    void testEdad66() {
        assertEquals(66,
                Ejercicio32Anyos.calcularEdadActual(1960, 2026));
    }

    @Test
    void testMenorEdad() {
        assertEquals(16,
                Ejercicio32Anyos.calcularEdadActual(2010, 2026));
    }

    @Test
    void testNacimientoFuturo() {
        assertEquals(-1,
                Ejercicio32Anyos.calcularEdadActual(2027, 2026));
    }
}
