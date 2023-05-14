import java.util.Locale;
import java.util.Scanner;

/*
 * Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
 */

public class Execicio7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("digite o numero de vezes: ");
        int vezes = sc.nextInt();

        double [] vetor = new double[vezes];

        for(int i =0; i<vetor.length; i++){
            System.out.println("Digite um numero:");
            vetor[i] = sc.nextDouble();
        }

        double numeros = 0;
        double media = 0;

        for( int i = 0; i < vetor.length; i++){
            numeros = numeros + vetor[i];
        }

        media = numeros / vetor.length;

        System.out.printf("MEDIA DO VETOR: %.3f\n", media);

        for ( int i = 0; i<vetor.length; i++){
            if( vetor[i] < media){
                System.out.printf("ELEMENTOS ABAIXO DA MEDIA:%.1f\n ", vetor[i] );
            }
        }

        
        sc.close();
    }
}
