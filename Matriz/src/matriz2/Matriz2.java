package matriz2;

public class Matriz2 extends Thread {
int matriz_dos[][] = new int[3][3];
    public void llenado() {
        for (int i = 0; i <= matriz_dos.length; i++) {
            for (int j = 0; j <= matriz_dos.length; j++) {
                matriz_dos[i][j] = (int) (Math.random() * 500);
            }
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("[ "  " ]");
            }
        }
    }
}
