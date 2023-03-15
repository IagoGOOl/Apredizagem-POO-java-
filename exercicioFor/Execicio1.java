import java.util.Scanner;

/**
 * Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
X, se for o caso
 */
public class Execicio1 {

    public static void main(String[] args) {
        
        int x, y ;

        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();

        for(int i = 0; i < x; i++){
            y = i % 2;

            if (y != 0){
                System.out.println(i);
            }
        }

        sc.close();
    }
}