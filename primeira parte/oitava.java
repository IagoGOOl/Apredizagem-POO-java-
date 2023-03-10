import java.util.Scanner;
public class oitava {
    public static void main(String[] args) {
        int Numero, resto;
        Scanner sc = new Scanner (System.in);
        System.out.println("digite o numero desejado:");
        Numero = sc.nextInt();
        resto = Numero % 2;
        if (resto == 0){
            System.out.println("par");
        }
        else {
            System.out.println("impar");
        }
        sc.close();


    }
}
