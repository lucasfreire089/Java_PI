import java.util.Scanner;


public class Exercicio4 {
    public static void main(String[] args) {

        //  Faça um algoritmo que leia dois números e imprima a soma, a subtração, a multiplicação e a divisão;
    Scanner teclado = new Scanner(System.in);

        System.out.println("Qual operação você deseja fazer? (Soma, Subtração, Multiplicação ou Divisão)");
        String operacao = teclado.nextLine();	

    float primereiroNumero, segundoNumero, soma, subtraçao, multiplicacao, divisao;
    System.out.println(
        "Digite o primeiro número:");
    primereiroNumero = teclado.nextFloat();
    System.out.println(
        "Digite o segundo número:");
    segundoNumero = teclado.nextFloat();

    if (operacao.equalsIgnoreCase("soma")){
        soma = primereiroNumero + segundoNumero;
        System.out.println(
            "A soma dos números é: " + soma);
    } else if (operacao.equalsIgnoreCase("subtraçao")){
        subtraçao = primereiroNumero - segundoNumero;
        System.out.println(
            "A subtração dos números é: " + subtraçao);
    } else if (operacao.equalsIgnoreCase("multiplicação")){
        multiplicacao = primereiroNumero * segundoNumero;
        System.out.println(
            "A multiplicação dos números é: " + multiplicacao);
    } else if (operacao.equalsIgnoreCase("divisão")){
        divisao = primereiroNumero / segundoNumero;
        System.out.println(
            "A divisão dos números é: " + divisao);
    } else {
        System.out.println("Operação inválida");
    }
    teclado.close();
    

//     Faça um algoritmo que leia as três notas de um aluno e o peso
// de cada prova e imprima sua média ponderada;

Scanner teclado2 = new Scanner(System.in);

float primeiraNota, segundaNota, terceiraNota, pesoPrimeiraNota, pesoSegundaNota, pesoTerceiraNota, mediaPonderada;

System.out.println(
    "Digite a primeira nota:");
primeiraNota = teclado2.nextFloat();

System.out.println(
    "Digite a segunda nota:");
segundaNota = teclado2.nextFloat();

System.out.println(
    "Digite a terceira nota:");
terceiraNota = teclado2.nextFloat();

System.out.println(
    "Digite o peso da primeira nota:");
pesoPrimeiraNota = teclado2.nextFloat();

System.out.println(
    "Digite o peso da segunda nota:");
pesoSegundaNota = teclado2.nextFloat();

System.out.println
("Digite o peso da terceira nota:");
pesoTerceiraNota = teclado2.nextFloat();

mediaPonderada = ((primeiraNota * pesoPrimeiraNota) + (segundaNota * pesoSegundaNota) + (terceiraNota * pesoTerceiraNota)) / (pesoPrimeiraNota + pesoSegundaNota + pesoTerceiraNota);

System.out.println("A média ponderada é: " + mediaPonderada);

teclado2.close();

//  Faça um algoritmo que leia o salário atual e o percentual de aumento de um funcionário e imprima o novo salário;

Scanner valor = new Scanner(System.in);
System.out.println(
  "Você deseja aumentar o valor do salário?(Digite sim ou nao)"
);
String resposta = valor.next();
if (resposta.equalsIgnoreCase("sim")) {
    System.out.println("Digite o valor do aumento em porcentagem: (Apenas o número))");
    float aumento = valor.nextFloat();
    float divisaoAumento = aumento / 100;
     System.out.println("Digite o valor do salário:");
    int salario = valor.nextInt();
     double novoSalario = (salario * divisaoAumento) + salario;
     System.out.printf(
        "O salário com o aumento de %.2f%% é: %.2f R$", aumento, novoSalario );
} else if (resposta.equalsIgnoreCase("nao")) {
    System.out.println("Digite o valor do salário atual:");
    int salario = valor.nextInt();
    System.out.printf("O salário é: %d R$", salario);
} else {
    System.out.println("ERROR VC FOI RACKIADO");
}

valor.close();


    }
    

}
