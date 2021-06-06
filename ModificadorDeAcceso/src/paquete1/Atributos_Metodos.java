
package paquete1;


public class Atributos_Metodos {
    int valor; //modificador de acceso por defecto puede ser accedido por cualquier clase dentro del mismo paquete
    public int valorUno; //public puede ser accedido por cualquier clase sin importar que se encuentre en distinto paquete
    private int valorDos; // private Solo puede ser accedido por la clase en la que se encuentra (se puede usar metodo getter y setter para acceder)
    protected String valorTres; //protected puede ser accedido desde su mismo paquete y cualquier clase que herede sin importar el paquete en el que se encuentre
    
    public void metodoKevin(){
        
    }

    /**
     * @return the valorDos
     */
    public int getValorDos() {
        return valorDos;
    }

    /**
     * @param valorDos the valorDos to set
     */
    public void setValorDos(int valorDos) {
        this.valorDos = valorDos;
    }
    
}
