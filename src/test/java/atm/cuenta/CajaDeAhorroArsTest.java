package atm.cuenta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CajaDeAhorroArsTest {
    @Test
    @DisplayName("Test retirar caja de ahorro")
    void testRetirar() {
        Cuenta cajaAhorro = new CajaDeAhorroArs(0303456, 1200.00);
        cajaAhorro.retirar(100.00);
        Assertions.assertEquals(1100.00, cajaAhorro.getSaldo());
    }
}