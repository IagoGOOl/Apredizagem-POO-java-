import java.util.Scanner;

/*
 * Ler um número inteiro N e calcular todos os seus divisores
 */

public class Execicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("digite o valor que deseja");
        num = sc.nextInt();

        for(int i = 1; i <= num; i++){

            double d = num % i;

            if( d == 0){

                System.out.println(i);
            }

        }
        
        sc.close();
    }
}
