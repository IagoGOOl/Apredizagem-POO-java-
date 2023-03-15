import java.util.Scanner;

public class Execicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("digite o numero desejado");
        num = sc.nextInt();

        for(int i = 1; i <= num; i++){

            int primeiro = i;
            int segunda = i * i;
            int terceira = i * i * i;

            System.out.printf("%d %d %d%n", primeiro, segunda, terceira);
            
        }

        sc.close();
    }
}
