import java.util.Scanner;
import java.util.Locale;
public class decimaPrimeira {
    public static void main(String[] args) {
       // difinição das variaveis e ivocação das bibliotecas.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int NumeroPedido, NumeroPedido2, Quatidade1, Quatidade2;
        double ValorPededido = 0;
        // Preechimento de variavel com o Scanner.
        System.out.println("digite os numero dos seu pedido e quatidade");
        NumeroPedido = sc.nextInt();
        Quatidade1 = sc.nextInt();
        System.out.println("digite os numero dos seu pedido");
        NumeroPedido2 = sc.nextInt();
        Quatidade2 = sc.nextInt();
        // estrutura condicional.
        switch (NumeroPedido) {
            case 1:
            ValorPededido = ValorPededido + 4.00 * Quatidade1;
            break;
            case 2:
            ValorPededido = ValorPededido +  4.50 * Quatidade1;
            break;
            case 3:
            ValorPededido = ValorPededido + 5.00 * Quatidade1;
            break;
            case 4:
            ValorPededido = ValorPededido + 2.00 * Quatidade1;
            break;
            case 5:
            ValorPededido = ValorPededido + 1.50 * Quatidade1;
            break;
            default:
                break;
        }
        
        switch (NumeroPedido2) {
            case 1:
            ValorPededido = ValorPededido + 4.00 * Quatidade2;
            break;
            case 2:
            ValorPededido = ValorPededido +  4.50 * Quatidade2;
            break;
            case 3:
            ValorPededido = ValorPededido + 5.00 * Quatidade2;
            break;
            case 4:
            ValorPededido = ValorPededido + 2.00 * Quatidade2;
            break;
            case 5:
            ValorPededido = ValorPededido + 1.50 * Quatidade2;
            break;
            default:
                break;
        }
        // imprimie o resultado.
        System.out.println("O valor total deu:" + ValorPededido + "Reis");
        // finalização no Scanner
        sc.close();
    }
}
