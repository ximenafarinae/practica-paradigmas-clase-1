package atm;

public class CajaDeAhorroArs extends Cuenta {


    public CajaDeAhorroArs(Integer nroDeCuenta, Integer saldo) {
        super(nroDeCuenta, saldo);
    }

    @Override
    public Integer retiro() {
        return saldo;
    }

    @Override
    public Integer deposito() {
        return saldo;
    }

    @Override
    public String consultaSaldo() {
        return "saldo"+ saldo;
    }

}

