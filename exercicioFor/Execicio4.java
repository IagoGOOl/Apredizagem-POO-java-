import java.util.Scanner;
/* 
 * Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
 */

public class Execicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int Num = sc.nextInt();

        for(int i = 0; i < Num; i++){

            System.out.println("digite o primeiro numero");
            int numeroPrimerio = sc.nextInt();
            System.out.println("digite o segundo numero");
            int numeroSegundo = sc.nextInt();

            if (numeroSegundo == 0){

                System.out.println("impossivel a divicao");

            }
            else {

                double Divisao = ( double ) numeroPrimerio / numeroSegundo;
                
                System.out.printf("%.1f%n", Divisao);

            }

        } 

        sc.close();
    }
}
