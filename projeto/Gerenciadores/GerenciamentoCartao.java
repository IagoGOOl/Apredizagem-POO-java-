package Gerenciadores;
import java.util.ArrayList;
import java.util.List;

import Cartao.Cartao;
import Cartao.CartaoCredito;
import Cartao.CartaoDebito;
import Conta.Conta;

public class GerenciamentoCartao {
    List <CartaoDebito> debito = new ArrayList<>();
   List <CartaoCredito> credito = new ArrayList<>();

    public void criarCartaoDebito (int numeroCartao, String nomeTitular, String bandeira, double taxa, String validade, Conta conta){
           CartaoDebito cartao = new CartaoDebito(numeroCartao, nomeTitular, bandeira, taxa, validade, conta);
        debito.add(cartao);

    }
    public void criaCartaoCredito(int numeroCartao, String nomeTitular, String bandeira, double taxa, String validade, Conta conta, Double limiteCartao){
        CartaoCredito cred = new CartaoCredito(numeroCartao, nomeTitular, bandeira, taxa, validade, conta, 800.0);
        credito.add(cred);
    }

    public CartaoCredito buscarCartaoCredito(int numeroCartao){
        CartaoCredito cartaoEncontrado = credito.stream()
         .filter(contaatual -> numeroCartao == contaatual.getNumeroCartao())
         .findFirst()
         .orElse(null);
        return cartaoEncontrado;
    }

    public void compra(int numeroCartao, String loja, double valor){
        CartaoCredito cartaoCredito = buscarCartaoCredito(numeroCartao);
        if (cartaoCredito != null) {
            cartaoCredito.compra(valor, loja);
        }
    }

   

    public String imprimirCartaoCredito(){
        String cartoes = "";
        for (Cartao cartao : credito) {
            cartoes += cartao.toString();
        }
        return cartoes;
    }

    @Override
    public String toString() {

        return "GerenciamentoCartao [credito =  " + this.imprimirCartaoCredito() +" " + credito.toString() + "]";
    }

    public void imprimirLancamento (int numeroCartao){
        CartaoCredito cartaoCredito = buscarCartaoCredito(numeroCartao);
        cartaoCredito.imprimirLancamento();
    }

    
}
