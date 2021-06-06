package operaciones;

import java.util.Scanner;

public class Retiro_Efectivo extends Consulta_Saldo {

    protected int retiro;

    @Override
    public void Operaciones() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Saldo Disponible: " + saldo);

        System.out.println("¿Cuanto desea retirar?");
        retiro = entrada.nextInt();

        saldo = saldo - retiro;

        System.out.println("Saldo Actual: " + saldo);
    }
}
