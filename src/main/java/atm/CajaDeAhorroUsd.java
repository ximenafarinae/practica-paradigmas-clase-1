package atm;

public class CajaDeAhorroUsd extends Cuenta {
    protected Integer importe;

    public CajaDeAhorroUsd(Integer nroCuenta, Integer saldo, Integer userId) {
        super(nroCuenta, saldo, userId);
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
