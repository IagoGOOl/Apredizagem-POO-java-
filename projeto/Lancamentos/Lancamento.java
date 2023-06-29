package Lancamentos;



public class Lancamento {
    private String loja;
    private double valor;
   
    
    public Lancamento( double valor, String loja) {
        this.valor = valor;
        this.loja = loja;
    }
    public Lancamento(){}

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getLoja() {
        return loja;
    }

    public void setLoja(String loja) {
        this.loja = loja;
    }

    @Override
    public String toString() {
        return "Lancamento [loja= " + loja + ", valor= " + valor + "]";
    }

    

   
    
}
