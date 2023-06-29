
import java.util.Scanner;




public class SistemaBanco{
    /* Scanner sc = new Scanner(System.in);
    List <Conta> conta = new ArrayList<>();*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        int opcao = 0;


        while(opcao != 8){
            System.out.println(".....................................................................");
            System.out.println("....................Sistema Bancario.................................");
            System.out.println(".....................................................................");
            System.out.println("... 1 Cadastra Conta....................................................");
            System.out.println("... 2 Depositar Conta....................................................");
            System.out.println("... 3 sacar Conta.......................................................");
            System.out.println("... 4 Cria Cartao.......................................................");
            System.out.println("... 5 Compra............................................................");
            System.out.println("... 6 Fatura........ ....................................................");
            System.out.println("... 7 extrato......... ....................................................");
            System.out.println("... 8 Sair......... ....................................................");

            System.out.print("digite um dos valores: ");
            opcao = sc.nextInt();
            switch(opcao){
                case 1: //cadastra
                menu.cadastraConta();
                break;
                case 2: // Depositar
                menu.deposito();
                break;
                case 3:// Sacar
                menu.sacar();
                break;
                case 4:// Criar Cartao
                menu.criarCartao();
                break;
                case 5:
                menu.compra();
                break;
                case 6:
                menu.fatura();
                break;
                case 7:
                menu.extrato();
                break;
                case 8:
                System.out.println("Obrigado!!!");
                break;
                default:
                System.out.println("numero invalido");
            }
        }
        sc.close();
        }


        
    }


       /* Scanner sc = new Scanner(System.in);
       List <Conta> conta = new ArrayList<>();

       int tamanho = 0;
       int opcao = 0;


       while (opcao != 5) {
        
       
       System.out.println(" Digite 1, se deseja cadastra uma conta. ");
       System.out.println("Digite 2, se deseja realiza um deposito. ");
       System.out.println("Digite 3, se deseja sacar alguma quantia.");
       System.out.println("Digite 4, se deseja se seja ver o saldo.");
       System.out.println("Digite 5, sair.");
       System.out.println("Escolha a opção acima: ");
       opcao = sc.nextInt();

       Conta conta3 = new ContaCorrente(cpf, numeroConta,  nome, valordep);

       switch(opcao){

        case 1: //cadastra

        System.out.println("quantas conta voce deja cadastra: ");

        int num = sc.nextInt();
        tamanho = num;

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
                    double valorDep = sc.nextDouble();

                    Conta cont = new ContaPoupaca(cpf, numeroConta, nome, valorDep, 0.5);
                    conta.add(cont);

                } else if ( dej == 'n'){

                    Conta cont = new ContaPoupaca(cpf, numeroConta, nome);
                    conta.add(cont);

                }else{
                    System.out.println("valor invalido!!!");
                }

            } else if (tipo == 2){

                System.out.println( "digite o valor do deposito:");
                double valordep = sc.nextDouble();

                Conta account = new ContaCorrente(cpf, numeroConta,  nome, valordep);
                conta.add(account);
            }
            
        }
        break;
        case 2: 

        System.out.println("digite o valor da deposito: ");
        double valorDep = sc.nextDouble();

        Conta account = new Conta();
        account.deposito(valorDep);
        
        break;

        case 3:

        System.out.println("voce deseja sacar de Conta: 1 poupaca, 2 corrente");
        int tip = sc.nextInt();

        if(tip == 1){
            System.out.println("digite o valor que deseja sacar");
            double quantia = sc.nextDouble();

            Conta account2 = new ContaPoupaca();
            account2.sacar(quantia);

        } else if( tip == 2){

            System.out.println("digite o valor que deseja sacar");
            double quantia = sc.nextDouble();

            Conta account2 = new ContaCorrente();
            account2.sacar(quantia);

        }else {
            System.out.println("Valor indesponivel");
        }

        break;

        case 4:

        System.out.println("voce deseja saldo de Conta: 1 poupaca, 2 corrente");
        int tipCont = sc.nextInt();

        if(tipCont == 1){

            Conta account2 = new ContaPoupaca();
            System.out.println(account2.toString());

        }else if ( tipCont == 2){

            Conta account2 = new ContaCorrente();
            System.out.println(account2.toString());
            
        }
        break;
        
        case 5: System.out.println("Fim!!!");
        break;

        default:System.out.println("valor invalido");
        sc.close();
        */

       

   
/* }


   /* }

 /* * public static void operacao(){
    System.out.println("");
    System.out.println(" Digite 1, se deseja cadastra uma conta. ");
    System.out.println("Digite 2, se deseja realiza um deposito. ");
    System.out.println("Digite 3, se deseja sacar alguma quantia.");
    System.out.println("Digite 4, se deseja  ver o saldo.");
    System.out.println("Digite 5, sair.");
    System.out.println("Escolha a opção acima: ");
    int opcao = sc.nextInt();

     switch(opcao){
        case 1:
        criaConta();
        break;
        case 2:
        deposita();
        break;
        case 3:
        saquer();
        break;
        case 4:
        saldo();
        break;
        case 5:
        exit;
        break;
         default:System.out.println("valor invalido!!!!");
       
     }

     public static void criaConta(){
         System.out.println("quantas conta voce deja cadastra: ");

        int num = sc.nextInt();
        tamanho = num;

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
                    double valorDep = sc.nextDouble();

                    Conta cont = new ContaPoupaca(cpf, numeroConta, nome, valorDep, 0.5);
                    conta.add(cont);

                } else if ( dej == 'n'){

                    Conta cont = new ContaPoupaca(cpf, numeroConta, nome);
                    conta.add(cont);

                }else{
                    System.out.println("valor invalido!!!");
                }

            } else if (tipo == 2){

                System.out.println( "digite o valor do deposito:");
                double valordep = sc.nextDouble();

                Conta account = new ContaCorrente(cpf, numeroConta,  nome, valordep);
                conta.add(account);
            }
            

     }
    
  }

  public static void deposita(){
    
        System.out.println("digite o valor da deposito: ");
        double valorDep = sc.nextDouble();

        Conta account = new Conta();
        account.deposito(valorDep);
  }*/

