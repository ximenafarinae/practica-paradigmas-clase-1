package atm.cuenta;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CuentaCorrienteTest {
    @Test
    @DisplayName("Test depositar cc")
    void testDepositar() {
        Cuenta ctaCte = new CuentaCorriente(0303456, 0.0);
        ctaCte.depositar(1200.00);
        Assertions.assertEquals(1200.00, ctaCte.getSaldo());
    }

    @Test
    @DisplayName("Test retirar cc")
    void testRetirar() {
        Cuenta ctaCte = new CuentaCorriente(0303456, 1200.00);
        ctaCte.retirar(100.00);
        Assertions.assertEquals(1070.00, ctaCte.getSaldo());
    }
}
