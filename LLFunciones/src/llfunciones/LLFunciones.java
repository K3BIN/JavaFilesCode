/*
 Clase para las funciones lógicas de una lavadora
 */
package llfunciones;

public class LLFunciones {

    private int kilos = 0, llenadoCompleto = 0, LavadoCompleto = 0, SecadoCompleto = 0, Tipo_Ropa = 0;    //Ropa blanca 1, Ropa Color 2

    //Constructor
    public LLFunciones(int kilos, int Tipo_Ropa) {
        this.kilos = kilos;
        this.Tipo_Ropa = Tipo_Ropa;
    }

    //método
    private void Llenado() {
        if (kilos <= 12) {
            llenadoCompleto = 1;
            System.out.println("Llenando...");
            System.out.println("Llenado completo");
        } else {
            System.out.println("Limie de carga exedido");
        }
    }

    //método
    private void Lavado() {
        Llenado();
        if (llenadoCompleto == 1) {
            if (Tipo_Ropa == 1) {
                System.out.println("Lavado suave");
                System.out.println("Lavando...");
                LavadoCompleto = 1;
            } else if (Tipo_Ropa == 2) {
                System.out.println("Lavado intenso");
                System.out.println("Lavando...");
                LavadoCompleto = 1;
            } else {
                System.out.println("Tipo de ropa no disponible, se lavará como ropa de color");
                LavadoCompleto = 1;
            }
        }
    }

    //método
    private void Secado() {
        Lavado();
        if (LavadoCompleto == 1) {
            System.out.println("Secando...");
            SecadoCompleto = 1;
        }
    }

    //método
    public void CicloFinalizado() {
        Secado();
        if (SecadoCompleto == 1) {
            System.out.println("Ciclo Finalizado");

        }
    }
}
