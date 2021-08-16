package atm.cuenta;

import atm.Usuario;

public abstract class Cuenta {
    protected Integer nroCuenta;
    protected Double saldo;

    protected Usuario titular;

    public Cuenta(Integer nroCuenta, Double saldo) {
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;

    }

    //Getters
    public Integer getNroCuenta() {
        return nroCuenta;
    }

    public Double getSaldo() {
        return saldo;
    }



    //Setters
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void setNroCuenta(Integer nroCuenta) {
        this.nroCuenta = nroCuenta;
    }


    //Metodos
    abstract void retirar(Double importe);

    public void depositar(Double importe) {
        saldo = saldo + importe;
    }



}
