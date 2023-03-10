import java.util.Scanner;
import java.util.Locale;
 class segundo {
  
    public static void main(String args[]){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double raio, pi, resultado;
        System.out.println("digite o valor desejado:");
        raio = sc.nextDouble();
        pi =  3.14159;
        resultado = pi * raio * raio;
        System.out.println(resultado);
        sc.close();

    }
}
