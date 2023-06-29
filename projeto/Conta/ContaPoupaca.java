package Conta;
public class ContaPoupaca extends Conta {
    private Double valorDojuros;

    public ContaPoupaca(String cpf, Integer numeroConta, String nome, Double saldo ) {
        super(cpf, numeroConta, nome, saldo);
    }
    public ContaPoupaca(){

    }


    public Double getValorDojuros() {
        return valorDojuros;
    }

    
    public ContaPoupaca(String cpf, Integer numeroConta, String nome) {
        super(cpf, numeroConta, nome );
    }


    public void setValorDojuros(Double valorDojuros) {
        this.valorDojuros = valorDojuros;
    }


    public double juros(){
        return this.saldo = this.saldo * valorDojuros;
    }


    public void juroSaldo(){
        this.saldo +=  valorDojuros;
    }


    @Override
    public void sacar (double quantia){
        this.saldo -= quantia;
    }

    
    @Override
    public String toString() {
        return "ContaPoupaca [nome " + getNome()
        + "Numero conta" + getNumeroConta()
        + "Saldo " + getSaldo()
        +  "valorDojuros=" + valorDojuros + "]";
    }
    

    
    
}
