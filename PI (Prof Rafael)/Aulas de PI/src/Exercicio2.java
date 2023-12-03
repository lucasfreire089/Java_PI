import java.util.Arrays;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        // Tirar a média de 4 notas
        int nota1 = 5;
        int nota2 = 4;
        int nota3 = 9;
        int nota4 = 8;
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        // Usando Array e laços
        int[] notas = { 5, 2, 5, 7 };
        int soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        // Usando reduce

        int[] novasNotas = { 4, 6, 8, 2, 7 };
        int novaSoma = Arrays.stream(novasNotas).reduce(0, (a, b) -> a + b);

        double mediaNova = (double) soma / notas.length;

        // Usando input

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a primeira nota:");
        int primeiraNota = teclado.nextInt();
        System.out.println("Digite a segunda nota:");
        int segundaNota = teclado.nextInt();
        double mediaGeral = (primeiraNota + segundaNota) / 2d;
        teclado.close();

        System.out.println(mediaGeral);
        System.out.println(media);
        System.out.println(mediaNova);
        System.out.println(novaSoma);

        // Calcular área do triangulo

        Scanner input = new Scanner(System.in);
        System.out.println("Digite a base:");
        int base = input.nextInt();
        System.out.println("Digite a altura:");
        int altura = input.nextInt();
        int area = (base * altura) / 2;
        input.close();
        System.out.println("A área do triângulo é: " + area);

        // Converter Valor em Real para Dolar

        // Scanner valor = new Scanner(System.in);
        // System.out.println("Digite o valor do dinheiro em real:");
        // int real = valor.nextInt();
        // int dolar = real/5;
        // System.out.println("A conversão para dolar é de: $" + dolar);
        // valor.close();

        // Converter a temperatura de Celsius para Fahrenheit

        Scanner temperatura = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius: ");
        int Celsius = temperatura.nextInt();
        double Fahrenheit = (Celsius * 1.8) + 32;
        System.out.println("A temperatura convertida é: " + Fahrenheit + "°F");
        temperatura.close();

        // Aumentar o salário de um funcionário em 35%

        Scanner valor = new Scanner(System.in);
        System.out.println("Você deseja aumentar o valor do salário?(Digite sim ou nao)");
        String resposta = valor.next();
        if (resposta.equalsIgnoreCase("sim")) {
            System.out.println("Digite o valor do salário:");
            int salario = valor.nextInt();
            double novoSalario = (salario * 0.35) + salario;
            System.out.println("O novo salário é de: " + novoSalario + "R$");
        } else if (resposta.equalsIgnoreCase("nao")) {
            System.out.println("Digite o valor do salário atual:");
            int salario = valor.nextInt();
            System.out.println("O salário permanece o mesmo: " + salario + " R$");
        } else {
            System.out.println("ERROR VC FOI RACKIADO");
        }

        valor.close();
    }

}
