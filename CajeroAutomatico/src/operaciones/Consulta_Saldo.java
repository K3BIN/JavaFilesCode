package operaciones;

public abstract class Consulta_Saldo {

    public static int saldo = 500;

    public void Consulta() {
        System.out.println("Saldo Actual: " + saldo);
    }

    public abstract void Operaciones();

}
