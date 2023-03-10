import java.util.Scanner;
public class Decima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int HorasComeço, HorasFinal, Resultado;
        System.out.println("digite a hora do começo do jogo");
        HorasComeço = sc.nextInt();
        System.out.println("digite a hora que terminou o jogo");
        HorasFinal = sc.nextInt();

        if( HorasComeço < HorasFinal){
             Resultado = HorasComeço - HorasFinal;
        }
        else{
            Resultado = 24 - HorasComeço + HorasFinal;
        }
        Resultado = Resultado * (-1);

        System.out.println("A duração do jogo foi " + Resultado + " Horas");
        sc.close();



    }
}
