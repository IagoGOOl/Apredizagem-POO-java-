public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    

    public double totalValorEstoque (){
        return preco * quantidade;
    }
    
    public void addProdutoEstoque (int quantidade){
        this.quantidade += quantidade;
    }

    public void removeProduto (int quantidade){
        this.quantidade -= quantidade;
    }
    public String tString(){
        return nome + "$" + String.format("%.2f", preco) + "," + quantidade + "unidade, Total: R$" + String.format("%.2f", totalValorEstoque());
    }
}
