import java.util.Scanner;

public class CTquestao1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("digite sua idade.");
        int idade = scan.nextInt();

        if ( idade < 16){
            System.out.println("menor que 16 anos nao pode votar");
        }
        else if(idade >= 16 && idade <= 17){
            System.out.println("O seu voto e facultativo.");
        } else if ( idade >= 18 && idade <= 65){
            System.out.println( "O seu voto e obrigatório." );

        }
        else{
            System.out.println("Voce já compriu sua obrigação com o Brasil, Seu voto é facultativo");
        }

        scan.close();
    }
}