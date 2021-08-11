package atm;

public class CajaDeAhorroArs extends Cuenta {


    public CajaDeAhorro(Integer nroDeCuenta) {
        super(nroDeCuenta);
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

