
import java.util.Scanner;
public class setima{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int Numero;
    System.out.println("digite o numero desejado");
    Numero = sc.nextInt();
    if (Numero < 0){
        System.out.println("Negativo");
    }
    else{
        if(Numero > 1){
            System.out.println("Positivo");
        }
        else{
            System.out.println("Neutro ");
        }
    }
    sc.close();
}
}