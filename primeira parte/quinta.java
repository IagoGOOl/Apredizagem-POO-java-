import java.util.Scanner;
import java.util.Locale;
public class quinta {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);

        int CodigoDaPeca1, CodigoDaPeca2, NumeroDePeca1, NumeroDePeca2;
        double ValorUnitPeca1, ValorUnitPeca2, ValorTotal, ValordePeca1, Valordepeca2; 

        System.out.println("Digite o codigo da peça que deseja:");
        CodigoDaPeca1= sc.nextInt();
        System.out.println("Digite o numero de peças :");
        NumeroDePeca1 = sc.nextInt();
        System.out.println("Valor unitario da peça:");
        ValorUnitPeca1 = sc.nextDouble();

        System.out.println("Digite o codigo da peça que deseja:");
        CodigoDaPeca2 = sc.nextInt();
        System.out.println("Digite o numero de peças :");
        NumeroDePeca2 = sc.nextInt();
        System.out.println("Valor unitario da peça:");
        ValorUnitPeca2 = sc.nextDouble();

        ValordePeca1 = ValorUnitPeca1 * NumeroDePeca1;
        Valordepeca2 = ValorUnitPeca2 * NumeroDePeca2;

        ValorTotal = ValordePeca1 + Valordepeca2;

        System.out.printf("o Valor a Pagar vair ser %.2f%n", ValorTotal);

        sc.close();



    }
    
}
