import java.util.Locale;
import java.util.Scanner;

/**
 * main
 */
public class main {

    public static final double PI = 3.14159;
    public static void main(String[] args) {
        // impotando o Locale e o Scanner criando objeto sc. 
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // pegando as infomação do radius.
        System.out.println("entre radius: ");
        double radius = sc.nextDouble();

        // pegando a infomação dos metodos que calcular a Circuferencia e o volume
        double c = circuferencia(radius);
        double v = volume (radius);

        //imprimindo  o resultados obtindos.
        System.out.printf("Cricunferacia: %.2f%n", c);
        System.out.printf("volume: %.2f%n", v);
        System.out.printf("PI: %.2f%n", PI);

        // fechamdo o objeto sc
        sc.close();
    }

    //metodo statico para calcualar  a circuferencia.
    public static double circuferencia(double radius){
        return 2.0 * PI * radius;
    }

    //metodos statico para calcualar o volume
    public static double volume (double radius){
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}