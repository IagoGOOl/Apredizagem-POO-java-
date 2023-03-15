import java.util.Locale;
import java.util.Scanner;
/*
 * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5.
 */

public class Execicio3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
    
        System.out.println("digite quanto vezes voce que fazer o calculo");
       int x = sc.nextInt();

        for (int i = 0; i < x; i++){
            double a, b, c;
            double media = 0;

            System.out.println("digite o primeiro valor");
            a = sc.nextDouble();
            System.out.println("digite o segundo valor");
            b = sc.nextDouble();
            System.out.println("digite o terceiro valor");
            c = sc.nextDouble();

            media = (a * 2.0 + b * 3.0 + c * 5.0);

            System.out.printf("%.1f%n",media);
        }

        sc.close();

    }
}
