import java.util.Locale;
import java.util.Scanner;

/*
Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
tela todos os números pares, e também a quantidade de números pares. 
*/

public class Execicio4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o numero de repticao que deseja: ");
        int numero = sc.nextInt();
        
        int [] numeroDigitados = new int [numero];

        for (int i = 0; i < numeroDigitados.length; i++){
            System.out.println("digite o numero desejado: ");
            numeroDigitados[i] = sc.nextInt();
        }

        int cont = 0;
        for( int i = 0; i < numeroDigitados.length; i++){

            if (numeroDigitados[i] % 2 == 0 ){
                System.out.printf(" %d ",numeroDigitados[i]);
                cont ++;
            }
        }

        System.out.println("\n foram " + cont + " numeros pares");



        sc.close();
    }
}
