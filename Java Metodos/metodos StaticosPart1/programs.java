import java.util.Locale;
import java.util.Scanner;

public class programs {
public static void main(String[] args) {
    // impotando o Locale e o Scanner criando objeto sc.
   Locale.setDefault(Locale.US); 
   Scanner sc = new Scanner(System.in);;

   // pegando as infomação do radius.
   System.out.println("entre radius: ");
   double radius = sc.nextDouble();

   // estaciando a class Calcular 
   Calcular calc = new Calcular();

//pegando a infomação dos metodos que calcular a Circuferencia e o volume
   double c = calc.circuferencia(radius);
   double v = calc.volume(radius);
   double PI = calc.PI;

   //imprimindo  o resultados obtindos.
   System.out.printf("Cricunferacia: %.2f%n", c);
   System.out.printf("volume: %.2f%n", v);
   System.out.printf("PI: %.2f%n", PI);

   // fechamdo o objeto sc
   sc.close();

}
}
