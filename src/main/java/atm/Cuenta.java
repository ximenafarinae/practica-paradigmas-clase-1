package atm;

public abstract class Cuenta {
    protected Integer nroCuenta;
    protected Integer saldo;

    protected Usuario titular;

    public Cuenta(Integer nroCuenta, Integer saldo) {
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;

    }

    //Getters
    public Integer getNroCuenta() {
        return nroCuenta;
    }

    public Integer getSaldo() {
        return saldo;
    }



    //Setters
    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }

    public void setNroCuenta(Integer nroCuenta) {
        this.nroCuenta = nroCuenta;
    }


    //Metodos
    abstract Integer retiro();

    abstract Integer deposito();

    abstract String consultaSaldo();


}
