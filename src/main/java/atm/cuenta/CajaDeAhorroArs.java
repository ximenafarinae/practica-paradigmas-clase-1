package atm.cuenta;

public class CajaDeAhorroArs extends Cuenta {

    public CajaDeAhorroArs(Integer nroCuenta, Double saldo) {
        super(nroCuenta, saldo);
    }

    @Override
    void retirar(Double importe) {
        saldo = saldo - importe;
    }

}

