// Um vendedor tem seu salário calculado em
// função do valor total de suas vendas. Este cálculo
// é feito de acordo com o seguinte critério: se o
// valor total de suas vendas for maior que R$
// 20.000,00, o vendedor receberá como salário,
// 10% do valor das vendas. Caso contrário, receberá
// apenas 7,5% do valor das vendas. Escrever um
// algoritmo que determine o valor ganho pelo
// vendedor;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual foi o total de vendas em reais que o vendedor vendeu?");
            float vendasTotal = teclado.nextFloat();
            float salario = 0;
            
        if(vendasTotal>20000){
             salario = vendasTotal * 0.10f;

        }else {
          salario = vendasTotal * 0.075f;
        }    

        System.out.printf("O salario do vendedor é de : %.2f R$", salario);

        teclado.close();
    }
}
