package atm.cuenta;

public class CajaDeAhorroUsd extends Cuenta {

    public CajaDeAhorroUsd(Integer nroCuenta, Double saldo) {
        super(nroCuenta, saldo);
    }

    @Override
    void retirar(Double importe) {
        saldo = saldo - (importe * 1.3);
    }
}
