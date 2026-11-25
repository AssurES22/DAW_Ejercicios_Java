package ut1IntroProg;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Ejercicio33MediaTest {

    @Test
    void deberiaCalcularMediaDeDosEnteros() {
        assertEquals(7.0,
                Ejercicio33Media.calcularNotaMedia(6, 8),
                0.001);
    }

    @Test
    void deberiaCalcularMediaConDecimales() {
        assertEquals(7.75,
                Ejercicio33Media.calcularNotaMedia(7.5, 8.0),
                0.001);
    }

    @Test
    void deberiaCalcularMediaConCeros() {
        assertEquals(0.0,
                Ejercicio33Media.calcularNotaMedia(0, 0),
                0.001);
    }

    @Test
    void deberiaCalcularMediaDeNotasMaximas() {
        assertEquals(10.0,
                Ejercicio33Media.calcularNotaMedia(10, 10),
                0.001);
    }

    @Test
    void deberiaCalcularMediaDeNotasDistintas() {
        assertEquals(5.5,
                Ejercicio33Media.calcularNotaMedia(4, 7),
                0.001);
    }
}
