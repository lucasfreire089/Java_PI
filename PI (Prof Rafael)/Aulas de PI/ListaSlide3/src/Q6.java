import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        int soma = 0;
        int idade= 0;
        int quantidade = 0;
        boolean lerIdade = true;

Scanner input = new Scanner(System.in);
System.out.println("Bem vindo ao programa de cadastro do IBGE, por favor me informe sua cidade.");
    String cidade = input.nextLine();

        while (lerIdade) {
            System.out.println("Digite a idade (ou 0 para finalizar)");
            idade = input.nextInt();

            if(idade == 0){
                lerIdade = false;
            }
            soma += idade;
            quantidade++;
        }



        if (quantidade > 0){

            double mediaIdade = (double) soma / quantidade;
            System.out.printf("A idade média da cidade " + cidade + "  é de %.2f", mediaIdade); 

        }


input.close();
    }
}
