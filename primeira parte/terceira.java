import java.util.Scanner;
public class terceira {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int LetraA, LetraB, LetraC, LetraD, Diferenca;
        System.out.println("digite o primeiro valor");
        LetraA = sc.nextInt();
        System.out.println("digite o segundo valor");
        LetraB = sc.nextInt();
        System.out.println("digite o terceiro valor");
        LetraC = sc.nextInt();
        System.out.println("digite o quarto valor");
        LetraD = sc.nextInt();

        Diferenca = LetraA * LetraB - LetraC * LetraD;

        System.out.println("A Diferença é " + Diferenca);
        sc.close();
    }
}
