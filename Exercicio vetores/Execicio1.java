import java.util.Locale;
import java.util.Scanner;

/**
 * Execicio1
 * Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
 */
public class Execicio1 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        //iniciando as bibliotecas
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //coletando o tamanho de vetor
        System.out.println("Quantos numeros voce vai digitar? ");
        int vezes = sc.nextInt();
      
       //criando o vetor
        int [] vact = new int [vezes];

        //preechando o vetor
        for (int i = 0; i < vact.length; i++){
            vact[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS:");

        //extraindo os numeros negativos do vetor
        for (int i = 0; i< vact.length; i++){
            if (vact[i] < 0){
                System.out.printf ("%d\n",vact[i]);
            }
        }

        sc.close();
    }
}