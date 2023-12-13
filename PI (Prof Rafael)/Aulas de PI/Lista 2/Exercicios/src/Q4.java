// O custo ao consumidor de um carro novo é a soma do
// custo de fábrica com a porcentagem do distribuidor e dos
// impostos, ambos aplicados ao custo de fábrica. Supondo
// que a porcentagem do distribuidor seja de 12% e a dos
// impostos de 45%, prepare um algoritmo para ler o custo
// de fábrica do carro e imprimir o custo ao consumidor;


import java.util.Scanner;


public class Q4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual é o custo de fábrica do carro?");
        float custoFabrica = teclado.nextFloat();
        float percentualDistribuidor = custoFabrica * 0.12f;
        float percentualImpostos = custoFabrica * 0.45f;

         float resultado = custoFabrica + percentualDistribuidor + percentualImpostos;

         System.out.println("O custo do consumidor é:" + resultado);
        
teclado.close();
    }
    
}
