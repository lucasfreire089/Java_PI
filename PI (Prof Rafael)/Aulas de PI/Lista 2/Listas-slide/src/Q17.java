// 17. Considerando uma eleição de apenas 2 candidatos,
// elabore um algoritmo que leia do teclado o número
// total de eleitores, o número de votos do primeiro
// candidato e o número de votos do segundo
// candidato. Em seguida, o algoritmo deverá
// apresentar o percentual de votos de cada um dos
// candidatos e o percentual de votos nulos;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
          Scanner teclado = new Scanner(System.in);
        System.out.println("Qual foi o total de votos?");
            int votosTotal = teclado.nextInt();
        System.out.println("Qual foi o número de votos do Lula?");
            int votosLula = teclado.nextInt();
        System.out.println("Qual foi o número de votos do Bolsonaro?");
            int votosBolsonaro = teclado.nextInt();

        int votosNulos = votosTotal - votosLula - votosBolsonaro;
        float percentualBolsonaro = (votosBolsonaro * 100f) / votosTotal;
        float percentualLula = (votosLula * 100f) / votosTotal;
        float percentualNulos = (votosNulos * 100f)/ votosTotal;

        if(votosLula>votosBolsonaro){
            System.out.println("O mais novo presidente é o Lula, com o percentual de " + percentualLula + " %.");
            System.out.println("O percentual do perdedor: " + percentualBolsonaro + " %.");
            System.out.println("O percentual de votos nulos foi de: " + percentualNulos + " %.");
        }else {
            System.out.println("O mais novo presidente é o Bolsonaro, com o percentual de " + percentualBolsonaro +" %.");
            System.out.println("O percentual do perdedor: " + percentualLula + " %.");
            System.out.println("O percentual de votos nulos foi de: " + percentualNulos + " %.");
        }teclado.close();
    }
}
