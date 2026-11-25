package ut3FundaPOO;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaBancariaJUnit {

    private CuentaBancaria cuenta;

    @BeforeEach
    void setUp() {
        // Inicializamos una cuenta de prueba antes de cada test
        cuenta = new CuentaBancaria("Juan Pérez", 500.0);
    }

    @Test
    void testConstructorYGetters() {
        assertEquals("Juan Pérez", cuenta.getsTitulo());
        assertEquals(500.0, cuenta.getdSaldo(), 0.001);
    }

    @Test
    void testSetters() {
        cuenta.setsTitulo("María Gómez");
        cuenta.setdSaldo(1000.0);

        assertEquals("María Gómez", cuenta.getsTitulo());
        assertEquals(1000.0, cuenta.getdSaldo(), 0.001);
    }

    @Test
    void testIngresar() {
        cuenta.ingresar(200.0);
        assertEquals(700.0, cuenta.getdSaldo(), 0.001);

        cuenta.ingresar(-50.0);
        assertEquals(650.0, cuenta.getdSaldo(), 0.001);
    }

    @Test
    void testRetirarExitoso() {
        cuenta.retirar(200.0);
        assertEquals(300.0, cuenta.getdSaldo(), 0.001);
    }

    @Test
    void testRetirarSaldoInsuficiente() {
        // Intentar retirar más de lo que hay (600 cuando hay 500)
        cuenta.retirar(600.0);
        
        // El saldo debe mantenerse intacto debido a la condición (dSaldo - s) > 0
        assertEquals(500.0, cuenta.getdSaldo(), 0.001);
    }

    @Test
    void testRetirarSinFondos() {
        // Configuramos una cuenta con saldo inicial en 0.0
        CuentaBancaria cuentaPobre = new CuentaBancaria("Deudor", 0.0);
        
        cuentaPobre.retirar(50.0);
        
        // El saldo debe seguir en 0.0
        assertEquals(0.0, cuentaPobre.getdSaldo(), 0.001);
    }

    @Test
    void testToString() {
        String esperado = "El saldo actual Juan Pérez es: 500.0";
        assertEquals(esperado, cuenta.toString());
    }
}