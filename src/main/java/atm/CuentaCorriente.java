package atm;

public class CuentaCorriente extends Cuenta {

    public CuentaCorriente(Integer nroCuenta, Integer saldo) {
        super(nroCuenta, saldo);
    }

   @Override //El retiro tiene un impuesto del 0.3%
    public Integer retiro() { //TODO: desarrollar el metodo retiro
        return saldo;
    }

    @Override
    public Integer deposito() { //TODO: desarrollar el metodo deposito
        return saldo;
    }

    @Override
    public String consultaSaldo() {
        return "saldo"+ saldo;
    }
}
