import java.util.Scanner;
/*
 * Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1.
 */
public class Execicio5 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("ate quanto voce deseja saber o fatorial");
            int Numero;

            Numero = sc.nextInt();

            int Fat = 1;
           


            for (int i = 1; i <= Numero; i++) {
                Fat = Fat * i;
            }

            System.out.println(Fat);
            
            sc.close();
        }
    }
}
