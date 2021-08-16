package atm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Con que cuenta desea operar?");
        System.out.println("1 - Cuenta Corriente");
        System.out.println("2 - Caja de Ahorros en pesos");
        System.out.println("3 - Caja de Ahorros en dólares");
        System.out.println("Ingrese la opción deseada: ");
        int opcion = sc.nextInt();

        List<Cuenta> cuentas= new ArrayList<>();

        Cuenta ahorro = new CajaDeAhorroArs(0303456, 0);
        Cuenta usd = new CajaDeAhorroUsd(11223344, 0);
        Cuenta ctaCte = new CuentaCorriente(44556677, 0);
        cuentas.add(ahorro);
        cuentas.add(usd);
        cuentas.add(ctaCte);

        Usuario user = new Usuario(1, "Pepe", "12345678", cuentas);

        while (opcion < 1 || opcion > 3) {
            System.out.println("Por favor, ingrese \"1\", \"2\", \"3\" o \"4\"");
            if(sc.hasNextInt())
                opcion = sc.nextInt();
        }
        switch (opcion) {
            case 1:

                switch (opcion) {

                }


        }


    }


}
