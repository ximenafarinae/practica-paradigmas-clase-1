package atm;

public class CajaDeAhorroUsd extends Cuenta {
    protected Integer importe;

    public CajaDeAhorroUsd(Integer nroCuenta, Integer saldo) {
        super(nroCuenta, saldo);
    }

    @Override
    public Integer retiro() {
        saldo = saldo - importe;
        return saldo;
    }

    @Override
    public Integer deposito() {
        saldo = saldo + importe;
        return saldo;
    }

    @Override
    public String consultaSaldo() {
        return "saldo" + saldo;
    }
}
