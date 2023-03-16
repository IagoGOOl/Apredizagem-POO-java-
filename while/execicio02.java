import java.util.Scanner;
/*
 * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
 */
public class execicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int eixoX, eixoY;
        System.out.println("digite o valor do X");
        eixoX = sc.nextInt();
        System.out.println("digite o valor Y");
        eixoY = sc.nextInt();
        while (eixoX != 0 && eixoY != 0){
            
            if (eixoX > 0 && eixoY > 0){
                System.out.println("Primeiro");
            } else if(eixoX > 0 && eixoY < 0){
                System.out.println("quarto");
            }else if( eixoX < 0 && eixoY > 0){
                System.out.println("segundo");
            }
            else if (eixoX < 0 && eixoY < 0){
                System.out.println("terceiro");
            }
            System.out.println("digite novamento os X");
            eixoX = sc.nextInt();
            System.out.println("digite novamento os y");
            eixoY = sc.nextInt();

        }
       
        sc.close();
    }
}
