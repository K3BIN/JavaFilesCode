package suma;

import java.util.Scanner;

public class SumaMain {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Primer Valor");
        int valorUno = entrada.nextInt();

        System.out.println("Segundo Valor");
        int valorDos = entrada.nextInt();

        //Método
        Suma valores = new Suma(valorUno, valorDos);
        valores.Imprimir();
    }
}
