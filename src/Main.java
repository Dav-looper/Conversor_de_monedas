import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ConsultaApi consulta = new ConsultaApi();
        Moneda moneda = consulta.buscaMoneda("USD");

        new Conversor(moneda);
    }
}
