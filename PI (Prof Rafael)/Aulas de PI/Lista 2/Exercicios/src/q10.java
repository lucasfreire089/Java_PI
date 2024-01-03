// Faça um algoritmo para ler duas variáveis inteiras A e
// B e garantir que A e B fiquem em ordem crescente,
// ou seja, a variável A deverá armazenar o menor valor
// fornecido e a variável B o maior;


import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
            System.out.println("Me dê um número inteiro");
            int A = teclado.nextInt();
        System.out.println("Me dê o segundo número:");
            int B = teclado.nextInt();

            if (A > B) {

                int troca = A;
                A = B;
                B = troca;

            }

            System.out.println("Os valores em ordem crescente são: " + A + " e " + B);
teclado.close();
    }
}
