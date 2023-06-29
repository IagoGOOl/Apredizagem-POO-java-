package Cartao;
import java.util.ArrayList;
import java.util.List;

import Conta.Conta;
import Lancamentos.*;

public class CartaoCredito extends Cartao {
    private Double limiteCartao;
    ArrayList<Lancamento> lancamentos = new ArrayList<>();

    public CartaoCredito(Double limiteCartao) {
        this.limiteCartao = limiteCartao;
    }

    public CartaoCredito(Integer numeroCartao, String nomeTitular, String bandeira, double taxa, String validade, Conta conta,
            Double limiteCartao) {
        super(numeroCartao, nomeTitular, bandeira, taxa, validade, conta);
        this.limiteCartao = limiteCartao;
    }

    public CartaoCredito(){
        
    }

    public Double getLimiteCartao() {
        return limiteCartao;
    }

    public void setLimiteCartao(Double limiteCartao) {

        if(limiteCartao >= 0){
            //this.lancamentos.add(new Lancamento(quantia, loja));
            this.limiteCartao = limiteCartao;
        }
        else{
            System.out.println("estorou ");
        }
        
    }

    public void compra(double quantia, String loja){
        setLimiteCartao(this.limiteCartao - quantia);
    }

    public void imprimirLancamento(){
        for (Lancamento lancamento : lancamentos) {
            System.out.println(lancamento);
        }
    }

    @Override
    public String toString() {
        return "CartaoCredito [ limiteCartao = " + limiteCartao + " Numero Cartao =  "+ getNumeroCartao() + " Nome Titular = " + getNomeTitular() + " Tipo cartao =  " + "  "+ getBandeira() + " " + " Taxa = " + getTaxa() +  " " +" Validade = " + getValidade() + "]";
    }

    


    

}
