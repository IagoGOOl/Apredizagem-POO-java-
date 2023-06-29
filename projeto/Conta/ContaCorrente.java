package Conta;
public class ContaCorrente extends Conta{
    private Double LimiterConta = 200.0;
   
    public ContaCorrente(String cpf, Integer numeroConta, String nome, Double saldo, Double limiterConta) {
        super(cpf, numeroConta, nome, saldo);
        LimiterConta = limiterConta;
    }

    public ContaCorrente(String cpf, Integer numeroConta, String nome, Double saldo) {
        super(cpf, numeroConta, nome, saldo);
    }

    public ContaCorrente(){

    }
    

    public Double getLimiterConta() {
        return LimiterConta;
    }

    public void setLimiterConta(Double limiterConta) {
        LimiterConta = limiterConta;
    }  
    public void emprestismo(double quantia){
        if(quantia <= LimiterConta){
            saldo += quantia - 10.0;
        }
    }

    @Override
    public void sacar(double quantia){
        super.sacar(quantia);
        saldo -= 2.0;
    }


    @Override
    public String toString() {
        return "ContaCorrente [ nome = " + getNome()
        + ", Numero conta = " + getNumeroConta()
        + ", Saldo = "  + getSaldo() +
        ", LimiterConta = " + LimiterConta + " ]";
    }
    
}
