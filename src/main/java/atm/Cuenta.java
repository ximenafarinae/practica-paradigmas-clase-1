package atm;

public abstract class Cuenta {
    protected Integer nroCuenta;
    protected Integer saldo;


    public Cuenta(Integer nroCuenta, Integer saldo){
        this.nroCuenta=nroCuenta;
        this.saldo=saldo;
    }

    public Integer getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(Integer nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }

    public abstract Integer retiro();
    public abstract Integer deposito();
    public abstract String consultaSaldo();



}
