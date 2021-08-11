package atm;

public class CuentaCorriente extends Cuenta {
    public CuentaCorriente(Integer nroCuenta, Integer saldo) {
        super(nroCuenta, saldo);
    }
    @Override
    public void retiro() {
        System.out.println("Realiza un entrenamiento (Clase Futbolista)");
    }
    @Override
    public void deposito() {
        System.out.println("Realiza un entrenamiento (Clase Futbolista)");
    }
    @Override
    public void consultaSaldo() {
        System.out.println("Realiza un entrenamiento (Clase Futbolista)");
    }
}
