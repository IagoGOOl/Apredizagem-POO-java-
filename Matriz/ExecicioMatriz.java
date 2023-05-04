import java.util.Scanner;

public class ExecicioMatriz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o numero de colunas: ");
        int m = sc.nextInt();

        System.out.println("digite o numero de linhas: ");
        int n = sc.nextInt();

        int [][] mat = new int [m] [n];

        for (int i = 0; i < m; i++){
            for (int j=0; j<n; j++){
                System.out.print("digite o numero: ");
                mat[i] [j] = sc.nextInt();
            }
        }

        System.out.println("Digite o valor que voce deseja verificar: ");
        int caso = sc.nextInt();

        for ( int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (mat[i][j] == caso){
                    if (j < mat[i].length-1){
                    System.out.println("Esquerda " + mat[i][j+1]);
                    }
                    if(j > 0){
                    System.out.println("A direta " + mat[i] [j-1]);
                    }
                    if(i > mat.length-1){
                    System.out.println("A baixo " + mat[i+1][j]);
                    }
                    if(i > 0){
                    System.out.println("Acima: " + mat[i-1] [j]);
                    }
                    System.out.println(" a posicao e: " + i + ", " + j);
                }
            }
        }

        sc.close();
    }
}