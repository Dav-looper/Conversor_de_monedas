import java.util.Map;
import java.util.Scanner;

public class Conversor {

    private final Moneda datos;

        public Conversor(Moneda datos) {
            this.datos = datos;
            iniciarConversion();
        }

        private void iniciarConversion() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Moneda base (por ejemplo, USD): ");
            String base = scanner.nextLine().toUpperCase();

            System.out.print("Moneda destino (por ejemplo, EUR): ");
            String destino = scanner.nextLine().toUpperCase();

            System.out.print("Cantidad en " + base + ": ");
            double cantidad = scanner.nextDouble();

            Map<String, Double> tasas = datos.conversion_rates();

            if (tasas.containsKey(base) && tasas.containsKey(destino)) {
                double tasaBase = tasas.get(base);
                double tasaDestino = tasas.get(destino);

                double resultado = cantidad / tasaBase * tasaDestino;

                System.out.printf("%.2f %s = %.2f %s%n", cantidad, base, resultado, destino);
            } else {
                System.out.println("Alguna de las monedas no es válida.");
            }
    }
}


