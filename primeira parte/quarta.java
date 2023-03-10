import java.util.Scanner;
import java.util.Locale;
public class quarta {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        int NumeroFucionario, HoraTrabalhada; 
        double ValorHora, Salario;

        System.out.println("digite o numero do fucionario");
        NumeroFucionario = sc.nextInt();
        System.out.println("digite as hora trabalhadas");
        HoraTrabalhada = sc.nextInt();
        System.out.println("digite o Valor Da hora me U$: ");
        ValorHora = sc.nextDouble();

        Salario = ValorHora * HoraTrabalhada;

        System.out.println("Numero do Fucionario: " + NumeroFucionario);
        System.out.printf("Salario: %.2f%n", Salario);

        sc.close();

    }
}
