import java.util.Scanner;
import java.util.Locale;
public class sexta {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double ladoA, ladoB, ladoC, triagulo, circulo, trapezio, quadrado, retangulo;
        System.out.println("digite o lado A");
        ladoA = sc.nextDouble();
        System.out.println("digite o lado B");
        ladoB = sc.nextDouble();
        System.out.println("digite o lado C");
        ladoC = sc.nextDouble();

        triagulo = ladoA * ladoC / 2.0;
        circulo = 3.14159 * ladoC * ladoC; 
        trapezio = (ladoA + ladoB) / 2.0 * ladoC;
        quadrado =  ladoB * ladoB;
        retangulo = ladoA * ladoB;

        System.out.printf("Triagulo é :%.3f%n", triagulo);
        System.out.printf("Circulo é :%.3f%n" ,circulo);
        System.out.printf("Trapezio é :%.3f%n", trapezio);
        System.out.printf("Quadrado é :%.3f%n", quadrado);
        System.out.printf("Retangulo é :%.3f%n", retangulo);

        sc.close();


    }
}
