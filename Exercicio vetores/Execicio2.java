import java.util.Locale;
import java.util.Scanner;

/*
 * Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor
 */

public class Execicio2 {
    public static void main(String[] args) {
        //iniciando a bibliotecas
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        //coletando o tamanho de vetor
        System.out.println("digite o numero de vezes que voce deseja?: ");
        int vezes = sc.nextInt();
        
        //criando o vetor
        double[] vect = new double[vezes];

        
        //preechando o vetor
        for (int i = 0; i < vect.length; i++){
            vect[i] = sc.nextDouble();
        }

        //somando os elementos do vetor
        double soma = 0.0;
        for (int i = 0; i < vect.length; i++){
            soma += vect[i];
        }

        //fazendo a media
        double media = soma / vezes;

        System.out.print("VALORES = ");

        //imprimendo os elementos do vetor
        for (int i = 0; i < vect.length; i++){
            System.out.printf("  %.1f  ", vect[i]);
        }

        System.out.println();
        System.out.println("A soma de todos os numero e: " + soma);
        System.out.println("A media de todos os numero e: " + media);

        sc.close();
    }
}
