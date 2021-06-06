package suma;

public class Suma {

    private int vUno, vDos, Resultado;

    //Constructor para el método Suma
    public Suma(int valorUno, int valorDos) {
           this.vUno = valorUno;
           this.vDos = valorDos;
    }
    
    //Método para la operación
    public void Operacion(){
        Resultado = vUno + vDos;
    }
    
    //Método para imprimir el resultado
    public void Imprimir(){
        Operacion();
        System.out.println("El resultado de la suma es: "+Resultado);
    }
}
