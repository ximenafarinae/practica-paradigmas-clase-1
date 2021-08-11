package atm;

public abstract class Cuenta implements ICuenta{
    protected Integer nroCuenta;
    protected Integer saldo;
    protected Integer userId;


    public Cuenta(Integer nroCuenta, Integer saldo, Integer userId) {
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
        this.userId = userId;
    }

    //Getters
    public Integer getNroCuenta() {
        return nroCuenta;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public Integer getUserId() {
        return userId;
    }


    //Setters
    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }

    public void setNroCuenta(Integer nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }


}
