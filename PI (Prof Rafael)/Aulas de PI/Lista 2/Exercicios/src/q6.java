// Uma companhia de carros paga a seus empregados um
// salário de R$ 1500,00 por mês mais uma comissão de R$
// 50,00 para cada carro vendido e mais 5% do valor da
// venda. Elabore um algoritmo para calcular e imprimir o
// salário do vendedor num dado mês recebendo como
// dados de entrada o nome do vendedor, o número de
// carros vendidos e o valor total das vendas.


import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual o nome do vendedor?");
        String vendedor = teclado.nextLine();
        System.out.println("Quantos carros ele vendeu?");
        int vendaDeCarros = teclado.nextInt();
        System.out.println("Qual o valor dos carros?");
        float valorCarros = teclado.nextFloat();
        

        float comissão = vendaDeCarros * 50;
        float porcentagemDaVenda = (vendaDeCarros * valorCarros) * 0.05f;
        float salário = comissão + porcentagemDaVenda + 1500.00f;
        
        System.out.println("O salário do " + vendedor + " foi de:" + salário + "R$M");
        

teclado.close();
    }
    
}
