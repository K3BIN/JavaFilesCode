package math;
import java.util.Random;

public class ClaseDos {
    public static void main(String[] args) {
        int aleatorio;        
        Random r = new Random();

        aleatorio = (int)((r.nextInt() * 100) + 1)/1000;
        System.out.println(aleatorio);
        
    }    
}
