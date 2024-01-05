// Faça um algoritmo para ler dois números inteiros e
// informar se estes números são iguais ou diferentes;

import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Me dê um número inteiro");
            int primeiroNumero = teclado.nextInt();
        System.out.println("Me dê o segundo número:");
            int segundoNumero = teclado.nextInt();

     if (primeiroNumero == segundoNumero){
        System.out.println("são inguais");
        
     }else { System.out.println("diferentes");}    


     teclado.close();

    }
}
