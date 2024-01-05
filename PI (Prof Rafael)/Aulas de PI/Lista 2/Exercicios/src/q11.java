// Faça um algoritmo para ler três valores reais e
// informar se estes podem ou não formar os lados de
// um triângulo e qual tipo de triângulo seria:
// Equilátero, Isóscele ou Escaleno;


import java.util.Scanner;

public class q11 { 
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
       
        System.out.println("Me dê um número inteiro");
            int A = teclado.nextInt();
        System.out.println("Me dê o segundo número:");
            int B = teclado.nextInt();
        System.out.println("Me dê o terceiro número:");
            int C = teclado.nextInt();

        if(A+B>C && B+C>A && A+C>B ){
            System.out.println("Podem formar um triângulo");

             if (A==B && B==C){
                System.out.println("Equilátero");
             }else if (A==B || B==C || C==A){
                System.out.println("Isósceles");
            }else {System.out.println("Escaleno");

             }
        }  else {System.out.println("ERR$R");}   


teclado.close();
    
}
    
}
