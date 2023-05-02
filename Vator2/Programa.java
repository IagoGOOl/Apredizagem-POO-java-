import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Produtos[] vect = new Produtos[n];

        for (int i = 0; i<vect.length; i++){
            sc.nextLine();
            String nome = sc.nextLine();
            double preco = sc.nextDouble();
            vect[i] = new Produtos(nome, preco);
        }
        double soma = 0.0;
        for (int i = 0; i<vect.length; i++){
            soma += vect[i].getPreco();
        }
        double avg = soma /vect.length;
        System.out.println("a media dos precos Sao:R$ " + avg);
        sc.close();
    }
}
