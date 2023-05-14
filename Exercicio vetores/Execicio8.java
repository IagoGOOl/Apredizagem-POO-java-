import java.util.Locale;
import java.util.Scanner;

/*
 * Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
digitado, mostrar a mensagem "NENHUM NUMERO PAR"
 */

public class Execicio8 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos elementos vai ter o vetor? ");
        int vezes = sc.nextInt();

        int[] numeroDigitados = new int [vezes];

        for ( int i = 0; i<numeroDigitados.length; i++){
            System.out.println("Digite um numero: ");
            numeroDigitados[i] = sc.nextInt();
        }

        double soma = 0;
        double posicao = 0;
        for (int i =0; i<numeroDigitados.length; i++){
            if (numeroDigitados[i] % 2 == 0){
                soma += (double) numeroDigitados[i];
                posicao ++;
            } 
        }

        double media = soma / posicao;

        if ( posicao == 0){
            System.out.println("Nenhum é par");
        } else{
            System.out.println("MEDIA DOS PARES " + media);
        }

        sc.close();
    }
    
}
