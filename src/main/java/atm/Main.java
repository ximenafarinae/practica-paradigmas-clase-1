package atm;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();
        Usuario user = new Usuario("Pepe", "12345678");
        Cuenta ahorro = new CajaDeAhorroArs(0303456, 0);
        Cuenta usd = new CajaDeAhorroUsd(11223344, 0);
        Cuenta ctaCte = new CuentaCorriente(44556677, 0);
        cuentas.add(ahorro);
        cuentas.add(usd);
        cuentas.add(ctaCte);



        //TODO: Hay que asociar el user a las cuentas.



    }


}
