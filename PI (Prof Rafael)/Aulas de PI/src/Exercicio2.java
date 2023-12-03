import java.util.Arrays;
import java.util.Scanner;


public class Exercicio2 {
    public static void main(String[] args) {
 // Tirar a média de 4 notas
        int nota1 = 5;
        int nota2 = 4;
        int nota3 = 9;
        int nota4 = 8;
    double media = (nota1 + nota2 + nota3 + nota4)/4;
// Usando Array e laços
    int[] notas = {5,2,5,7};
    int soma = 0;
    for (int i=0; i<notas.length; i++){
        soma += notas[i];
    }
 double mediaNova = (double) soma / notas.length;

    // Usando reduce

    int[] novasNotas = {4,6,8,2,7};
    int novaSoma = (Arrays.stream(novasNotas).reduce(0, (a, b) -> a+b))/novasNotas.length;

    //Usando input
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite a primeira nota:");
    int primeiraNota = teclado.nextInt();
    System.out.println("Digite a segunda nota:");
    int segundaNota = teclado.nextInt();
    int mediaGeral = (primeiraNota + segundaNota) / 2;
    teclado.close();
    System.out.println(mediaGeral);


    
    System.out.println(media);
    System.out.println(mediaNova);
    System.out.println(novaSoma);
    }
}
