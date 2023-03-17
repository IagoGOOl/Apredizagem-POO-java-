import java.util.Locale;
import java.util.Scanner;

/**
 * CompraDolar
 */
public class CompraDolar {
 public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("digite o valor da contacao do dolar");
    double valDolar = sc.nextDouble();

    // coletar o valor de Dolares que vai ser comprado.
    System.out.println("digite o valor em  dolar que deseja compra: ");
    double dolar = sc.nextDouble();

    double valorReais = ConverteDolar.ValorReal(dolar, valDolar);

    System.out.printf("O valor: %.2f%n", valorReais);



    sc.close();
 }
}