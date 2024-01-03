// Um programa que calcule o valor do desconto do
// INSS. Os critérios são os seguintes:
// • salário < 1.100 => 7,5%
// • salário >= 1.100,01 e <= 2.203,48 => 9%
// • salário >= 2.203,49 e <= 3.305,22 => 12%
// • salário >= 3.305,23 =>14%

import java.util.Scanner;

public class q13 {
 public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Qual o valor do seu salário?");
    float salario = teclado.nextFloat();
    float desconto = 0f;
    
if(salario < 1.100){
     desconto = salario * 0.075f;

}else if(salario  >= 1100.01 && salario <= 2203.48){
     desconto = salario * 0.09f;
    
}else if(salario >= 2203.49 && salario <= 3305.22){
     desconto = salario * 0.12f;

}else {
    desconto = salario * 0.14f;

}
  
    System.out.println("O desconto foi de:" + desconto + "R$");
    System.out.printf("O desconto foi de: %.2f R$\n paranoid agradece", desconto);

teclado.close();

 }   
}
