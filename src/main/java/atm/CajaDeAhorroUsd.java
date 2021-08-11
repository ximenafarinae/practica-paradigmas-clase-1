package atm;

public class CajaDeAhorroUsd extends Cuenta {
    public CajaDeAhorroUsd(Integer nroCuenta, Integer saldo) {
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
