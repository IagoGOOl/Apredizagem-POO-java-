/**
 * Fucionarios
 */
public class Fucionarios {

   private Integer  id;
   private String nome;
   private Double salario;



public Fucionarios (){

}

  public Fucionarios(Integer id, String nome, Double salario){
    this.id = id;
    this.nome = nome;
    this.salario = salario;
   }

   public void setNome(String nome) {
    this.nome = nome;
   }
   public String getNome(){
    return nome;
   }

   public void setId(Integer id){
    this.id = id;
   }

   public Integer getId() {
       return id;
   }

   public void setSalario(double salario){
    this.salario = salario;
   }

   public Double getSalario(){
    return salario;
   }

   public void AumentaSalario( double porcetagem){
    salario += salario * porcetagem / 100.0;
   }

   public String toString() {
    return id + ", " + nome + ", " + String.format("%.2f", salario);
}
}