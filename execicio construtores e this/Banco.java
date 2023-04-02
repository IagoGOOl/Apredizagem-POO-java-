
import java.util.Locale;
import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        CadastraConta cadastraConta = new CadastraConta();
        
        double valorConta;
        System.out.println("digite o seu nome completo:");
        String nome = sc.nextLine();
        System.out.println("digite o numero da conta que deseja abrir");
        int numeroConta = sc.nextInt();
        System.out.println("");
        System.out.println("voce deseja fazer algum deposito na abertura de conta?  s para Sim /  n para Nao: ");
        char dep = sc.next().charAt(0);
        if (dep == 's'){
            System.out.println("digite o valor que seja deposita: ");
            valorConta = sc.nextDouble();
            cadastraConta = new CadastraConta(nome, numeroConta, valorConta);
        }
        else {
           cadastraConta = new CadastraConta(nome, numeroConta);
        }
        

        System.out.println("o valor que vocer tem na conta é : " + cadastraConta.toString());

        System.out.println("digite valor que voce deseja deposita? ");
        valorConta = sc.nextDouble();

        cadastraConta.DepositoValorConta(valorConta);

        System.out.println("o valor que vocer tem na conta é : " + cadastraConta.toString());




        System.out.println("digite o valor que deseja sacar:  ");
        valorConta = sc.nextDouble();

        cadastraConta.SaqueValorConta(valorConta);

        System.out.println(cadastraConta.toString());







        sc.close();
    }
}