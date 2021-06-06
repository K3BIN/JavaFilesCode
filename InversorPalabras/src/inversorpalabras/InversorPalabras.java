package inversorpalabras;

import java.util.Scanner;

public class InversorPalabras {

    public static void main(String[] args) {

        String palabra = "", palabraInvertida = "";
        int longitudPalabra = 0;

        System.out.print("Escribe una palabra o frase ");
        Scanner entrada = new Scanner(System.in);
        palabra = entrada.nextLine();

        //System.out.println(""+ palabra);
        longitudPalabra = palabra.length();
        //System.out.println(""+ longitudPalabra); 

        while (longitudPalabra != 0) {
            palabraInvertida += palabra.substring(longitudPalabra - 1, longitudPalabra);
            longitudPalabra--;
        }
        System.out.println("Palabra invertida: " + palabraInvertida);
        System.out.println("");
    }

}
