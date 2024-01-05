import java.util.Scanner;



public class Q3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual o número você deseja calcular o quadrado?");
        float numero = teclado.nextFloat();
        double calcular = Math.pow(numero, 2);
        System.out.println("O numero é: "+ calcular);
        teclado.close();


    }
}
