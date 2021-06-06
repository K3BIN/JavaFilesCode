package cajero;

import operaciones.*;
import java.util.Scanner;

public class Cajero {

    public static void main(String[] args) {
        int op;
        do {

            System.out.println("1. Consulta de Saldo");
            System.out.println("2. Retiro de Efectivo");
            System.out.println("3. Depósito de Efectivo");
            System.out.println("4. Salir");
            Scanner entrada = new Scanner(System.in);
            op = entrada.nextInt();

            switch (op) {
                case 1: {
                    Deposito_Efectivo mensajeroC = new Deposito_Efectivo();
                    mensajeroC.Consulta();
                    break;
                }
                case 2: {

                    Retiro_Efectivo mensajeroR = new Retiro_Efectivo();
                    mensajeroR.Operaciones();
                    break;
                }
                case 3: {

                    Deposito_Efectivo mensajeroD = new Deposito_Efectivo();
                    mensajeroD.Operaciones();
                    break;
                }
                case 4: {
                    System.out.println("Vuelva pronto");
                    break;
                }

                default: {
                    System.out.println("Elige otra opción");
                    break;
                }
            }
        } while (op != 4);
    }
}
