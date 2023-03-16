import java.util.Scanner;
/*
 * Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
exemplo.
 */
public class execicio3 {
    public static void main(String[] args) {
        int Gasolina =0 , Diesel = 0,  Alcool = 0, Fim, produto = 0;
        String obrigado = "Muito Obrigado";
        Scanner sc = new Scanner (System.in);
        Fim = 0;
        while(Fim != 4){
            System.out.println("digite qual produto deseja: 1 alcool, 2 gasolina, 3 diesel, 4 fechar");
            produto = sc.nextInt();

            if (produto == 1){
                Alcool += 1;
            }else if(produto == 2){
                Gasolina += 1;
            }else if( produto == 3){
                Diesel += 1;
            }else if (produto == 4){
                Fim += 4;


            }
        } 
        
        System.out.println("Alcool: " + Alcool);
        System.out.println("Gasolina: " + Gasolina);
        System.out.println("Diesel:" + Diesel);
        System.out.println(obrigado);
        sc.close();

    }
    

}
