public class CadastraConta {
    private String nome;
    private int numeroConta;
    private double valorConta;

    public String erro = " nao e possivel sacar um valor que existente em sua conta.";

   public CadastraConta(String nome, int numeroConta, double  inicialDeposito) {
    this.nome = nome;
    this.numeroConta = numeroConta;
    DepositoValorConta(inicialDeposito);
    }
    public CadastraConta (String nome, int numeroConta){
      this.nome = nome;
      this.numeroConta = numeroConta;
    }
    public CadastraConta (){

    }

    public String getNome (){
        return nome;
     }

     public void setNome (String nome){
        this.nome = nome;
     }

     public int getNumeroConta(){
        return numeroConta;
     }

     /* public void setNumeroConta(int numeroConta){
        this.numeroConta = numeroConta;
     }*/

     public double getValorConta(){
        return valorConta;
     }

    /*  public int VerificarConta (int entNumeroConta){
        int resp;
        if (entNumeroConta != numeroConta){
            return resp = 404;
        } else {
            return resp = 400;
        } 
     }*/

     public void DepositoValorConta (Double valorConta){
        this.valorConta += valorConta;
     }

     /**
    * @param valorConta
    */
   public void SaqueValorConta(double valorConta) {
        if (valorConta <= this.valorConta){
            this.valorConta  -= valorConta + 5.0;
        }
      }
        public String toString(){
        return " " + "ola " + nome + " sua conta de numero: " + numeroConta + ", Possui em conta o valor de: R$ " + String.format("%.2f", valorConta);
       }
     }


