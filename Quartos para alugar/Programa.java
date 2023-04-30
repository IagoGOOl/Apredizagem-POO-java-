import java.util.Locale;
import java.util.Scanner;

/*
 *   A dona de um pensionato possui dez quartos para alugar para estudantes,
sendo esses quartos identificados pelos números 0 a 9.
Fazer um programa que inicie com todos os dez quartos vazios, e depois
leia uma quantidade N representando o número de estudantes que vão
alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos
N estudantes. Para cada registro de aluguel, informar o nome e email do
estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha
que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
um relatório de todas ocupações do pensionato, por ordem de quarto,
conforme exemplo.
 */

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Aluguel [] Quartos = new Aluguel[10];

        System.out.println("Digite a quantidade pessoa que voce deseja: ");
        int numeroQuartos = sc.nextInt();

        for (int i = 1; i <= numeroQuartos; i++ ){
            System.out.println();
            System.out.println( "Aluguel # " + i + ":");
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Quarto: ");
            int numeroQuarto = sc.nextInt();

            Aluguel aluguel = new Aluguel(nome, email);

            Quartos[numeroQuarto] = aluguel;

        }

        System.out.println();
        System.out.println("Quartos ocupados: ");
      for (int i = 0; i < Quartos.length; i++){
        if (Quartos[i] != null){
            System.out.println( i + ": " + Quartos[i]);
        }
      }

        sc.close();
    }
}
