package atm;

public class CajaDeAhorroArs extends Cuenta {

    public CajaDeAhorroArs(Integer nroCuenta, Integer saldo,Integer userId) {
        super(nroCuenta, saldo, userId);
    }

    @Override
    public Integer retiro() { return saldo; }
    @Override
    public Integer deposito() {
        return saldo;
    }

    @Override
    public String consultaSaldo() {
        return "saldo"+ saldo;
    }

}

