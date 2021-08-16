package atm.cuenta;

public class CuentaCorriente extends Cuenta {

    public CuentaCorriente(Integer nroCuenta, Double saldo) {
        super(nroCuenta, saldo);
    }

    @Override
    void retirar(Double importe) {
        saldo = saldo - (importe * 1.3);
    }


}
