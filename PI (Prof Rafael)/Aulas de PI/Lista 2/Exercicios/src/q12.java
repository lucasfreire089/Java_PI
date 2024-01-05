// Fazer Elaborar um programa que lê 2 valores a e b e
// os escreve com a mensagem: “São múltiplos” ou “Não
// são múltiplos”
// ;

import java.util.Scanner;

public class q12 {
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

        if(B % A == 0){
            System.out.println(A + " é um múltiplo de " + B);

         }else 
            { System.out.println(A + " não é um múltiplo de " + B);}
        

       teclado.close();

    }
}
