package Cartao;
import Conta.Conta;


public  abstract class Cartao {
    private Integer numeroCartao;
    private String nomeTitular;
    private String bandeira;
    private double taxa;
    private String validade;
    private Conta conta;

    

    public Cartao() {
    }
    


    public Cartao(Integer numeroCartao, String nomeTitular, String tipoCartao, double taxa, String validade, Conta conta) {
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
        this.bandeira = tipoCartao;
        this.taxa = taxa;
        this.validade = validade;
        this.conta = conta;
    }



    public Integer getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(Integer numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String tipoCartao) {
        this.bandeira = tipoCartao;
    }

    public void TipoCartao(String tipoString){
        if (bandeira != "ouro" ){
             this.taxa = 4.00;
        }else{
            this.taxa = 0.0;
        }
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }



    public String getValidade() {
        return validade;
    }



    public void setValidade(String validade) {
        this.validade = validade;
    }



    public Conta getConta() {
        return conta;
    }



    public void setConta(Conta conta) {
        this.conta = conta;
    }

    
}
