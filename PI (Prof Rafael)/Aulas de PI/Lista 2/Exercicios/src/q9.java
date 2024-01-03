// Faça um algoritmo para ler um número inteiro e
// informar se o número é par ou ímpar;

import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {

         Scanner teclado = new Scanner(System.in);
         System.out.println("mim de um numero inteiro papai:");
         int numero = teclado.nextInt();

         if(numero % 2 == 0){
            System.out.println("é par");
         } else {System.out.println("é antipar");}
        teclado.close();
    }
    
}
