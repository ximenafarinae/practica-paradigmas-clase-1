package atm;

public class CajaDeAhorroArs extends Cuenta {
    protected String tipo;


    public CajaDeAhorroArs(Integer nroDeCuenta, Integer saldo, String tipo) {
        super(nroDeCuenta, saldo);
        this.tipo = tipo;
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

