package atm;

public class Main {

    public static void main(String[] args) {
        Usuario user = new Usuario("Pepe", "12345678");

        Cuenta ahorro = new CajaDeAhorroArs(0303456, 0);
        Cuenta usd=new CajaDeAhorroUsd(11223344, 0);
        Cuenta ctaCte=new CuentaCorriente(44556677, 0);
    }


}
