package operaciones;

import java.util.Scanner;

public class Deposito_Efectivo extends Consulta_Saldo {

    protected int ingreso;

    @Override
    public void Operaciones() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la cantidad a depositvar?");
        ingreso = entrada.nextInt();

        saldo = ingreso + saldo;
        System.out.println("Saldo Nuevo: " + saldo);
    }

}
