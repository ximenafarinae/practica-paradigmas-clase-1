package atm;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String opcion = sc.nextLine();

        ArrayList<Cuenta> cuentas = new ArrayList<>();

        Usuario user = new Usuario(1, "Pepe", "12345678");

        Cuenta ahorro = new CajaDeAhorroArs(0303456, 0, user.getId());
        Cuenta usd = new CajaDeAhorroUsd(11223344, 0, user.getId());
        Cuenta ctaCte = new CuentaCorriente(44556677, 0, user.getId());

        cuentas.add(ahorro);
        cuentas.add(usd);
        cuentas.add(ctaCte);

        //TODO: Hacer menu de operaciones.




    }


}
