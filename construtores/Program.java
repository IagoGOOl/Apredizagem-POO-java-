import java.util.Locale;
import java.util.Scanner;

public class Program {

public static void main(String[] args) {
    Locale.setDefault(Locale.US);
   Scanner sc = new Scanner(System.in);

    Produto produto = new Produto();

    System.out.println("Cadastre o produto desejado:");
    System.out.println("Nome do produto: ");
    produto.nome = sc.nextLine();
    System.out.println("Digite o preço do produto: ");
    produto.preco = sc.nextDouble();
    System.out.println("Quatidade em estoque: ");
    produto.quantidade = sc.nextInt();

    System.out.println();
    System.out.println("informaçoes do produtor" + produto.tString());
     
    System.out.println();
    System.out.println("digite a quantidade de produtos que deseja adicionar: ");
    int quantidade = sc.nextInt();
    produto.addProdutoEstoque(quantidade);

    System.out.println();
    System.out.println("os produtos atualizados" + produto.tString());

    System.out.println();
    System.out.println("digite a quantidade de produto que deseja remover do estoque: ");
    quantidade = sc.nextInt();
    produto.removeProduto(quantidade);

    System.out.println();
    System.out.println("Os produtos atulizados" + produto.toString());
    sc.close();

 }
}