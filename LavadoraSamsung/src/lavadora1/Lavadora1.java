
package lavadora1;
import Libreria.LLFunciones;
import java.util.Scanner;

public class Lavadora1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("¿Ropa blanca o color?");
        System.out.println("1-Ropa blanca / 2-Ropa Color");
        int Ropa=entrada.nextInt();
        
        System.out.println("¿Cuantos kilos de ropa?");
        int kilos=entrada.nextInt();
        
        LLFunciones mensajero = new LLFunciones(kilos, Ropa);
        mensajero.setTipo_Ropa(2);
        System.out.println("El tipo de ropa es: "+ mensajero.getTipo_Ropa());
        mensajero.CicloFinalizado();
        
    }
}
