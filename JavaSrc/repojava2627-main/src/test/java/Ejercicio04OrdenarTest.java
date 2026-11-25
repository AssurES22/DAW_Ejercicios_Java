import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import ut2estructControl.Ejercicio04Ordenar;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Ejercicio04OrdenarTest {

    private final InputStream originalIn = System.in;
    private final PrintStream originalOut = System.out;
    private ByteArrayOutputStream outContent;

    @BeforeEach
    public void setUp() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setIn(originalIn);
        System.setOut(originalOut);
    }

    private void proporcionarEntrada(String entrada) {
        System.setIn(new ByteArrayInputStream(entrada.getBytes()));
    }

    @ParameterizedTest
    @CsvSource({
        "'5 4 3', '5 4 3'",         // num1 > num2 > num3
        "'5 3 4', '5 4 3'",         // num1 > num3 > num2
        "'4 5 3', '5 4 3'",         // num2 > num1 > num3
        "'3 5 4', '5 4 3'",         // num2 > num3 > num1
        "'3 4 5', '5 4 3'",         // num3 > num2 > num1
        "'4 3 5', '5 4 3'",         // num3 > num1 > num2
        "'5 5 2', '5 5 2'",         // num1 == num2 > num3
        "'5 2 5', '5 5 2'",         // num1 == num3 > num2
        "'2 5 5', '5 5 2'"          // num2 == num3 > num1
    })
    public void testOrdenarNumerosDistintosOParcialmenteIguales(String entrada, String salidaEsperada) {
        proporcionarEntrada(entrada);

        Ejercicio04Ordenar.main(new String[]{});

        String salidaReal = outContent.toString();
        assertTrue(salidaReal.contains(salidaEsperada), 
            "Para la entrada '" + entrada + "' se esperaba encontrar '" + salidaEsperada + "' en la salida.");
    }

    @Test
    public void testTodosLosNumerosIguales() {
        proporcionarEntrada("4 4 4");

        Ejercicio04Ordenar.main(new String[]{});

        String salidaReal = outContent.toString();
        assertTrue(salidaReal.contains("Son iguales"), 
            "Para tres números iguales se esperaba el mensaje 'Son iguales'.");
    }
}