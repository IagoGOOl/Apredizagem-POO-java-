package Compra;
import Interface.Estorno;
import Lancamentos.Lancamento;

public class CompraEstorno extends Lancamento implements Estorno  {
    private String dataEstorno;
    private String descricao;
    private Double valorEstorno;
   
    
    public CompraEstorno (String loja, double valor, String dataEstorno,String descricao,Double valorEstorno){
        super(valor, loja);
        this.dataEstorno = dataEstorno;
        this.descricao = descricao;
        this.valorEstorno = valorEstorno;
    }


    public String getDataEstorno() {
        return dataEstorno;
    }


    public void setDataEstorno(String dataEstorno) {
        this.dataEstorno = dataEstorno;
    }


    public String getDescricao() {
        return descricao;
    }


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public Double getValorEstorno() {
        return valorEstorno;
    }


    public void setValorEstorno(Double valorEstorno) {
        this.valorEstorno = valorEstorno;
    }


    public double devolveValor() {
        return getValorEstorno();
    }
}
