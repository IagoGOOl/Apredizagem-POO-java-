import java.util.Locale;
import java.util.Scanner;

public class ProgramaParaCalc {

    public static void main(String[] args) {
       //invocação do elementos importados.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o radius da circuferecia: ");
        double radius = sc.nextDouble();

        double c = Calcular.cicurferencia(radius);
        double v = Calcular.volume(radius);

        System.out.printf("circuferencia: %.2f%n", c);
        System.out.printf("volume: %.2f%n", v);
        System.out.printf("PI: %.2f%n", Calcular.PI);



        sc.close();

    }
}
