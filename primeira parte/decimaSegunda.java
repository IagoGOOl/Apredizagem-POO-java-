import java.util.Scanner;
import java.util.Locale;
public class decimaSegunda {
   public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    double EixoX, EixoY;
    System.out.println("Digite as coordenada do eixo X");
    EixoX = sc.nextDouble();
    System.out.println("Digite as coordenada do eixo Y");
    EixoY = sc.nextDouble();
    if (EixoX == 0.0 && EixoY == 0.0){
        System.out.println("Origem");
    }
    else{
        if(EixoX == 0.0){
            System.out.println("Eixo Y");
        }
        else {
            if( EixoY == 0.0){
                System.out.println("Eixo X");
            }
            else{
                if(EixoX > 0.0 && EixoY > 0.0){
                    System.out.println("Q1");
                }
                else{
                    if(EixoX < 0.0 && EixoY > 0.0){
                        System.out.println("Q2");
                    }
                    else{
                        if(EixoX < 0.0 && EixoY > 0.0){
                            System.out.println("Q3");
                        }
                        else{
                            System.out.println("Q4");
                        }
                    }
                }
            }

        }
    }
    sc.close();
    
   } 
}
