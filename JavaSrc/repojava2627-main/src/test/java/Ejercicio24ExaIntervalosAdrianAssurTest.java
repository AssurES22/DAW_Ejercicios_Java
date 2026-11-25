import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import ut2estructControl.Ejercicio24ExaIntervalosAdrianAssur;

public class Ejercicio24ExaIntervalosAdrianAssurTest {

    @Test
    void testSuma() {
        assertEquals(25,
        		Ejercicio24ExaIntervalosAdrianAssur.suma(3, 7));
    }

    @Test
    void testSumaUnSoloNumero() {
        assertEquals(5,
        		Ejercicio24ExaIntervalosAdrianAssur.suma(5, 5));
    }

    @Test
    void testMedia() {
        assertEquals(5.0,
        		Ejercicio24ExaIntervalosAdrianAssur.media(3, 7));
    }

    @Test
    void testMediaDecimal() {
        assertEquals(2.5,
        		Ejercicio24ExaIntervalosAdrianAssur.media(1, 4));
    }
}

