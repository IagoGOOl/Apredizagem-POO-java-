import java.util.Scanner;
public class primeiro {

    public static void main(String args[]) {
        Scanner sc =  new Scanner(System.in);
        int PrimeiroNumero = sc.nextInt();
        int SegundoNumero = sc.nextInt();
        int Resultado = PrimeiroNumero + SegundoNumero; 
        System.out.println(Resultado);
        sc.close();
    }
}