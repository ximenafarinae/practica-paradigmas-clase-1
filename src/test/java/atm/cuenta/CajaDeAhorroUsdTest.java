package atm.cuenta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CajaDeAhorroUsdTest {
    @Test
    @DisplayName("Test retirar caja usd")
    void testRetirar() {
        Cuenta cajaUsd = new CajaDeAhorroUsd(0303456, 1200.00);
        cajaUsd.retirar(100.00);
        Assertions.assertEquals(1070.00, cajaUsd.getSaldo());
    }

}