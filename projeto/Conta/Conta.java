package Conta;
public  class Conta {
    private String cpf;
    private Integer numeroConta;
    private String nome;
    protected Double saldo;

    
    public Conta(String cpf, Integer numeroConta, String nome, Double saldo) {
        this.cpf = cpf;
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.saldo = saldo;
    }

    
    public Conta() {
    }


    public String getCpf() {
        return cpf;
    }


    public Conta(String cpf, Integer numeroConta, String nome) {
        this.cpf = cpf;
        this.numeroConta = numeroConta;
        this.nome = nome;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public Integer getNumeroConta() {
        return numeroConta;
    }


    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public Double getSaldo() {
        return this.saldo;
    }


   public void deposito(double quantia){
    this.saldo += quantia;
   }
   
   
   public void sacar (double quantia){
    this.saldo -=  quantia - 5.0;
   }
    
    
}
