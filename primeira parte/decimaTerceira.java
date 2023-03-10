import java.util.Scanner;
public class decimaTerceira {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       double Salario, impostoPagar;
       System.out.println("digite o valor do seu salario:");
       Salario = sc.nextDouble();
       if (Salario <= 2000){
        impostoPagar = 0.0; 
       }
       else {
        if ( Salario <= 3000){
            impostoPagar = (Salario - 2000 ) * 0.08;
        }
        else{
            if( Salario <= 4500){
                impostoPagar = (Salario - 3000.0) * 0.18 + 1000.0 * 0.08;
            }
            else {
                impostoPagar = (Salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
            }
        }
       }
       if(impostoPagar == 0.0){
        System.out.println("Isento");
       }
       else{
        System.out.printf("R$ %.2f%n", impostoPagar);
       }
       sc.close();
    }
}
