import java.util.Scanner;

import Conta.Conta;
import Gerenciadores.GerenciamentoCartao;
import Gerenciadores.GerenciementoConta;

public class Menu {
    Scanner sc = new Scanner(System.in);
    GerenciementoConta genConta = new GerenciementoConta();
    GerenciamentoCartao genCartao = new GerenciamentoCartao();

    public void cadastraConta(){

        System.out.println("quantas contas voce deseja cadastra: ");
        int num = sc.nextInt();

         for (int i = 0; i < num; i++){

             System.out.print("Digite o CPF:");
             sc.nextLine();
             String cpf = sc.nextLine();
             System.out.print("Digite o numero da conta: ");
             int numeroConta = sc.nextInt();
             System.out.print("Digite o seu nome: ");
             sc.nextLine();
             String nome = sc.nextLine();
             System.out.print("Qual tipo da conta: 1 Poupanca, 2 Corrente: ");
             int tipo = sc.nextInt();

             if ( tipo == 1){
                System.out.print("Voce Deseja deposita algum valor: s / n: ");
                char dej = sc.next().charAt(0);

                if(dej == 's'){
                    System.out.print("digite o valor do daposito: ");
                    double valordep = sc.nextDouble();
                    genConta.criaConta(tipo, cpf, numeroConta, nome, valordep);
                } else if ( dej == 'n'){
                    genConta.criaConta(tipo, cpf, numeroConta, nome, 0.0);
                }else{
                    System.out.println("valor invalido!!!");
                }
            } else if (tipo == 2){
                System.out.print( "digite o valor do deposito: ");
                double valorDep = sc.nextDouble();
                genConta.criaConta(tipo, cpf, numeroConta, nome, valorDep);
                
            }
    } 

}
public void deposito(){
    System.out.print("digite o numero da conta: ");
    int numeroConta = sc.nextInt();
    System.out.print("digite o valor que deseja deposita: ");
    double valor = sc.nextDouble();
    genConta.depositar(valor, numeroConta);

    }

    public void sacar (){
        System.out.print("digite o numero da conta: ");
        int numeroConta = sc.nextInt();
        System.out.print("digite o valor que deseja sacar: ");
        double valor = sc.nextDouble();
         genConta.sacar(valor, numeroConta);
       
    }

    public Conta buscadorPop(int numeroConta){
     Conta veriConta = genConta.buscarConta(numeroConta);
     return veriConta;

    }

     public void extrato(){
        System.out.println("digite o numero da conta que deseja ver o extrato");
        int numeroConta = sc.nextInt();
         Conta conta = genConta.buscarConta(numeroConta);
         if (conta != null){
            System.out.println(conta);
         }else{
            System.out.println("conta nao existe");
         }
    }



    // Trabalhando com Gerenciador de Cartao.

    public void criarCartao(){
        System.out.print("digite o tipo da Cartao: 1 Cartao de Debito, 2 Cartao Credito: ");
        int tipo = sc.nextInt();
        System.out.print("digite o numero do Cartao:  ");
        int numeroCartao = sc.nextInt();
        System.out.print("digite o Nome do titular do Cartao:  ");
        sc.next();
        String nomeTitular = sc.nextLine();
        System.out.print("digite o Bandeira do Cartao:  ");
        String bandeira = sc.nextLine();
        System.out.print("digite a Validade do Cartao: ");
        String validade = sc.nextLine();
        System.out.print("digite o numero da conta:  ");
        int numeroConta = sc.nextInt();

        Conta conta = this.buscadorPop(numeroConta);
        if ( conta == null){
            System.out.println("conta invalida");
        }else if ( tipo == 1){
            Double taxa = 5.0;
            genCartao.criarCartaoDebito(numeroCartao, nomeTitular, bandeira,taxa, validade, conta );
        }else{
            Double taxa = 0.0;
            genCartao.criaCartaoCredito(numeroCartao, nomeTitular, bandeira,taxa,validade,conta, 800.0);
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

        genCartao.compra(numeroCartao, loja, valor);
    }

    public void fatura (){
        System.out.println("digite o numero do cartao");
        int numeroCartao = sc.nextInt();
        genCartao.imprimirLancamento(numeroCartao);
    }



}

