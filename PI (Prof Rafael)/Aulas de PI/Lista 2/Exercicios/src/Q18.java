import java.util.Scanner;


public class Q18{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual é o custo de fábrica do carro?");
        float custoFabrica = teclado.nextFloat();
        float percentualDistribuidor = custoFabrica * 0.28f;
        float percentualImpostos = custoFabrica * 0.45f;

         float resultado = custoFabrica + percentualDistribuidor + percentualImpostos;

         System.out.println("O custo do consumidor é:" + resultado);
        
teclado.close();
    }
    
}
