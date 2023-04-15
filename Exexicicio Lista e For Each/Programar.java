import java.util.ArrayList;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programar {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("digite o numero de fucionarios que voce deseja cadastra: ");
       int numeroFucionarios = sc.nextInt();

        List < Fucionarios> fucionarios = new ArrayList<>();

        for (int i = 0; i < numeroFucionarios; i++ ){

            System.out.println();
            System.out.println("Emplyoee # " + (i + 1) + ":" );
            System.out.print("digite o ID do fucionario: ");
            Integer id = sc.nextInt();

           // while (hasId(fucionarios, id)){

           // }
            System.out.print("Nome:");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.print("digite o salario do fucionario: ");
            Double salario = sc.nextDouble();

            Fucionarios fucionarios2 = new Fucionarios(id, nome, salario);

            fucionarios.add(fucionarios2); 
            
        }

        System.out.println("digite o ID do fucionario que vai ter o salario aumentado.");
        int idSalario = sc.nextInt();

        Fucionarios emp = fucionarios.stream().filter(x -> x.getId() == idSalario).findFirst().orElse(null);
        if(emp == null){
            System.out.println("Esse ID nao existe");
        }else{
            System.out.print("digite a porcetagem:");
            double porcetagem = sc.nextDouble();
            emp.AumentaSalario(porcetagem);
        }

        System.out.println();
        System.out.println("lista de fucionarios");
        for (Fucionarios fun : fucionarios){
            System.out.println(fun);
        }



        sc.close();
    }

   /*  public static Integer posicao(List<Fucionarios> fucionarios, int id){
        for (int i = 0; i < fucionarios.size(); i++ ){
            if(fucionarios.get(i).getId() == id){
                return i;
            }
            return null;
        }*/
    }

