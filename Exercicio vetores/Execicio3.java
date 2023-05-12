import java.util.Locale;
import java.util.Scanner;

/*
 * Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver.
 */

public class Execicio3 {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        //iniciando as bibliotecas.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //coletando os tamanhos dos vetores.
        System.out.println("digite a quantidade de pessoas: ");
        int numero = sc.nextInt();
       
        // iniciando os vetores.
        String [] nome = new String[numero];
        int [] idade = new int [numero];
        double[] altura = new double [numero];


        //preechando os vetores.
        for(int i = 0; i < numero; i++){

            System.out.println("digite o nome: ");
            nome[i] = sc.next();

            System.out.println("digite sua idade: ");
            idade[i] = sc.nextInt();

            System.out.println("digite sua altura:");
            altura[i] = sc.nextDouble();

        }

        double soma = 0.0;
        // somando as alturas.
        for(int i = 0; i < altura.length; i++){
            soma += altura[i];
        }
        // fazendo a media 
        double media = soma / altura.length;

        int menor = 0;

        //coletando o percentual de menos de 16 anos
        for (int i = 0; i<nome.length; i++){
            if(idade[i] < 16){
                menor ++;
            }
        }
        
        // transforamando em Porcentagem
        double percentualMenores = ((double) menor / numero) * 100.0;

        // imprindo os dados obtidos.
        System.out.printf("\nAltura media = %.2f\n" , media);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);

        // imprimindo os nomes das pessoa sendo menor de 16 anos
        for(int i = 0; i < idade.length; i++){
            if ( idade[i]< 16){
                System.out.println(nome[i]);
            }
        }

        sc.close();

    }
}
