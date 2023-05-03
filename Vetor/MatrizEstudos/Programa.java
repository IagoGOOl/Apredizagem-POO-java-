import java.util.Scanner;

/**
 * Escreva uma descrição da classe Programa aqui.
 * 
 * @author Iago Alve
 * @version 27/03/2023
 */
public class Programa
{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("digite o valor da matriz quadrada");
        int n = sc.nextInt();
        
        int [ ] [ ] mat = new int [n] [n];
        
        for ( int i=0; i<n; i++){
            for (int j =0; j<n; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        int negativo = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j<n; j++){
                if (i == j){
                    System.out.print(mat[i] [j]);
                }
                if (mat [i] [j] < 0){
                    negativo = negativo + 1;
                }
            }
        }

        System.out.println("o numero de numeros negativos foram: " + negativo);

        
        
        sc.close();
    }
}
