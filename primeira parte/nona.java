import java.util.Scanner;
public class nona {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int PrimeiroNumero, SegundoNumero;
        System.out.println("digite o primero numero");
        PrimeiroNumero = sc.nextInt();
        System.out.println("digite o segundo numero");
        SegundoNumero = sc.nextInt();
        if (PrimeiroNumero % SegundoNumero == 0 || SegundoNumero % PrimeiroNumero == 0){
            System.out.println("São Multiplos");
        }
        else{
            System.out.println("Não é multiplos");
        }
        sc.close();
    }
}
