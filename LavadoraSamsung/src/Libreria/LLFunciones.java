/*
 Clase para las funciones lógicas de una lavadora
 */
package Libreria;

public class LLFunciones {

    private int kilos = 0, llenadoCompleto = 0, LavadoCompleto = 0, SecadoCompleto = 0, Tipo_Ropa = 0;    //Ropa blanca 1, Ropa Color 2

    //Constructor
    public LLFunciones(int kilos, int Tipo_Ropa) {
        this.kilos = kilos;
        this.Tipo_Ropa = Tipo_Ropa;
    }

    //método
    private void Llenado() {
        if (getKilos() <= 12) {
            setLlenadoCompleto(1);
            System.out.println("Llenando...");
            System.out.println("Llenado completo");
        } else {
            System.out.println("Limie de carga exedido");
        }
    }

    //método
    private void Lavado() {
        Llenado();
        if (getLlenadoCompleto() == 1) {
            if (Tipo_Ropa == 1) {
                System.out.println("Lavado suave");
                System.out.println("Lavando...");
                setLavadoCompleto(1);
            } else if (Tipo_Ropa == 2) {
                System.out.println("Lavado intenso");
                System.out.println("Lavando...");
                setLavadoCompleto(1);
            } else {
                System.out.println("Tipo de ropa no disponible, se lavará como ropa de color");
                setLavadoCompleto(1);
            }
        }
    }

    //método
    private void Secado() {
        Lavado();
        if (getLavadoCompleto() == 1) {
            System.out.println("Secando...");
            setSecadoCompleto(1);
        }
    }

    //método
    public void CicloFinalizado() {
        Secado();
        if (getSecadoCompleto() == 1) {
            System.out.println("Ciclo Finalizado");

        }
    }
    
    //Setter y Getter
    
    public int getTipo_Ropa(){
        return Tipo_Ropa;
    }
    
    public void setTipo_Ropa(int Tipo_Ropa){
        this.Tipo_Ropa= Tipo_Ropa;
    }

    /**
     * @return the kilos
     */
    public int getKilos() {
        return kilos;
    }

    /**
     * @param kilos the kilos to set
     */
    public void setKilos(int kilos) {
        this.kilos = kilos;
    }

    /**
     * @return the llenadoCompleto
     */
    public int getLlenadoCompleto() {
        return llenadoCompleto;
    }

    /**
     * @param llenadoCompleto the llenadoCompleto to set
     */
    public void setLlenadoCompleto(int llenadoCompleto) {
        this.llenadoCompleto = llenadoCompleto;
    }

    /**
     * @return the LavadoCompleto
     */
    public int getLavadoCompleto() {
        return LavadoCompleto;
    }

    /**
     * @param LavadoCompleto the LavadoCompleto to set
     */
    public void setLavadoCompleto(int LavadoCompleto) {
        this.LavadoCompleto = LavadoCompleto;
    }

    /**
     * @return the SecadoCompleto
     */
    public int getSecadoCompleto() {
        return SecadoCompleto;
    }

    /**
     * @param SecadoCompleto the SecadoCompleto to set
     */
    public void setSecadoCompleto(int SecadoCompleto) {
        this.SecadoCompleto = SecadoCompleto;
    }
            
}
