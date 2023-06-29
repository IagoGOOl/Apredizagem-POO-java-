package Cartao;
import Conta.Conta;

public class CartaoDebito extends Cartao{
    private Conta conta;
    public CartaoDebito(double tax, Conta conta) {
        this.conta = conta;
    }
    public CartaoDebito(Integer numeroCartao, String nomeTitular, String bandeira, double taxa, String validade,
            Conta conta) {
        super(numeroCartao, nomeTitular, bandeira, taxa, validade, conta);
        this.conta = conta;
    }

    public void debitar (double valor){
        this.conta.sacar(valor);
    }
 
    
}
