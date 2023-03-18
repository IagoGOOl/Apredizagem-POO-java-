import java.util.Scanner;

import java.util.Locale;

public class projeto1 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner Variavel = new Scanner(System.in);

        double Xv;
         Xv = Variavel.nextDouble();


        System.out.printf("voce digitou: %.2f%n", Xv );

        Variavel.close();

    }
}
