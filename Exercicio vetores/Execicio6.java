import java.util.Locale;
import java.util.Scanner;

/*
 * Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
o vetor C gerado.
 */

public class Execicio6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("digite a quantindade numero que deseja: ");
        int vezes = sc.nextInt();


        int [] vectA = new int[vezes];
        int [] vectB = new int [vezes];
        int [] vectC = new int [vezes];

        for( int i = 0; i < vectA.length; i++){
            System.out.println("digite valores do vetor A:  ");
            vectA[i] = sc.nextInt();
        }

        for( int i = 0; i < vectB.length; i++){
            System.out.println("digite valores do vetor B:  ");
            vectB[i] = sc.nextInt();
        }
        System.out.println("A soma dos dois vetores sao: ");
        for ( int i = 0; i < vectC.length; i++){
            vectC[i] = vectA[i] + vectB[i];
            System.out.println(vectC[i]);
        }


        sc.close();
    }
}
