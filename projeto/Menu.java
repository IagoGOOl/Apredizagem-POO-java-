import java.util.Scanner;

import Cartao.Cartao;
import Conta.Conta;
import Conta.ContaCorrente;
import Conta.ContaPoupaca;
import Gerenciadores.GerenciamentoCartao;
import Gerenciadores.GerenciementoConta;

public class Menu {
    Scanner sc = new Scanner(System.in);
    GerenciementoConta genConta = new GerenciementoConta();
    GerenciamentoCartao catCretito = new GerenciamentoCartao();

    public void cadastraConta(){
        System.out.println("quantas conta voce deja cadastra: ");
        int num = sc.nextInt();
         for (int i = 0; i < num; i++){

             System.out.print("Digite o CPF:");
             sc.nextLine();
             String cpf = sc.nextLine();

             System.out.print("Digite o numero da conta: ");
             int numeroConta = sc.nextInt();

             System.out.println("Digite o seu nome:");
             sc.nextLine();
             String nome = sc.nextLine();

             System.out.println("Qual tipo da conta: 1 Poupanca, 2 Corrente");
             int tipo = sc.nextInt();

             if ( tipo == 1){
                System.out.println("Voce Deseja deposita algum valor: s / n");
                char dej = sc.next().charAt(0);

                if(dej == 's'){
                    System.out.println("digite o valor do daposito: ");
                    double valordep = sc.nextDouble();
                    genConta.criaConta(tipo, cpf, numeroConta, nome, valordep);

                } else if ( dej == 'n'){
                    genConta.criaConta(tipo, cpf, numeroConta, nome, 0.0);

                }else{
                    System.out.println("valor invalido!!!");
                }

            } else if (tipo == 2){
                System.out.println( "digite o valor do deposito:");
                double valorDep = sc.nextDouble();
                genConta.criaConta(tipo, cpf, numeroConta, nome, valorDep);
                
            }
    } 

}
public void daposito(){
    System.out.print("digite o tipo da conta: ");
    int tipo = sc.nextInt();
    System.out.print("digite o valor que deseja deposita: ");
    double valor = sc.nextDouble();
    System.out.print("digite o numero da conta: ");
    int numeroConta = sc.nextInt();
    if(tipo == 1){
        genConta.depositarPop(valor, numeroConta);
    }else if (tipo == 2){
        genConta.depositar(valor, numeroConta);
    }else{
        System.out.println("conta invalida!!!");
    }

    }

    public void sacar (){
        System.out.print("digite o numero da conta: ");
        int numeroConta = sc.nextInt();
        System.out.print("digite o tipo da conta: ");
        int tipo = sc.nextInt();
        System.out.print("digite o valor que deseja sacar: ");
        double valor = sc.nextDouble();

        if(tipo == 1){
            genConta.sacarPop(valor, numeroConta);
        }else if( tipo == 2){
            genConta.sacar(valor, numeroConta);
        }
    }

    public Conta buscadorPop(int numeroConta){
     Conta veriConta = genConta.buscarConta(numeroConta);
     if(veriConta != null){
        return veriConta;
     }else {
        return genConta.buscarContaPop(numeroConta);
     }
    }

    public void extrato(){
        System.out.println("digite o numero da conta que deseja ver o extrato");
        int numeroConta = sc.nextInt();
        System.out.println("digite o tipo da conta que deseja ver o extrato");
        int tipo = sc.nextInt();

        System.out.println(genConta.printConta(tipo, numeroConta));

    }


    // Trabalhando com Gerenciador de Cartao.

    public void criarCartao(){
        System.out.print("digite o tipo da Cartao: 1 Cartao de Debito, 2 Cartao Credito: ");
        int tipo = sc.nextInt();
        System.out.print("digite o numero do Cartao:  ");
        int numeroCartao = sc.nextInt();

         System.out.print("digite o Nome do titular do Cartao:  ");
         sc.nextLine();
        String nomeTitular = sc.nextLine();

         System.out.print("digite o Bandeira do Cartao:  ");
         sc.nextLine();
        String bandeira = sc.nextLine();

        System.out.print("digite a Validade do Cartao: ");
        sc.nextLine();
        String validade = sc.nextLine();

        System.out.print("digite o numero da conta:  ");
        int numeroConta = sc.nextInt();

        if ( tipo == 1){
            Double taxa = 5.0;
            Conta conta = this.buscadorPop(numeroConta);
            catCretito.criarCartaoDebito(numeroCartao, nomeTitular, bandeira,taxa, validade, conta );
        }else{
            Double taxa = 0.0;
            Conta conta = this.buscadorPop(numeroConta);
            catCretito.criaCartaoCredito(numeroCartao, nomeTitular, bandeira,taxa,validade,conta, 800.0);
        }

    }

    public void compra(){

        System.out.println("digite o numero do seu Cartao");
        int numeroCartao = sc.nextInt();
        System.out.print("digite nome da loja: ");
        sc.nextLine();
        String loja = sc.nextLine();
        System.out.println("digite o valor da compra");
        double valor = sc.nextDouble();

        catCretito.compra(numeroCartao, loja, valor);
    }

    public void fatura (){
        System.out.println("digite o numero do cartao");
        int numeroCartao = sc.nextInt();
        catCretito.imprimirLancamento(numeroCartao);
    }



}

