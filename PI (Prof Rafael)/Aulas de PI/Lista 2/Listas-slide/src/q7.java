import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual é a base do triângulo?");
            float baseTriangulo = teclado.nextFloat();
        System.out.println("Qual é a altura do triângulo?");
            float alturaTriangulo = teclado.nextFloat();
        float areaTriangulo = (baseTriangulo * alturaTriangulo)/2;

        
        System.out.println("Qual o lado do retângulo?");
            float lado = teclado.nextFloat();
        float areaRetangulo = lado*lado;

        System.out.println("Qual é a base maior do trapézio?");
            float baseMaiorTrapezio = teclado.nextFloat();
        System.out.println("Qual é a base menor do trapézio?");
            float baseMenorTrapezio = teclado.nextFloat();    
        System.out.println("Qual é a altura do trapézio?");
            float alturaTrapezio = teclado.nextFloat();
        float areaTrapezio = ((baseMaiorTrapezio + baseMenorTrapezio)*alturaTrapezio)/2;

        float areaTotal = areaRetangulo + areaTrapezio + areaTriangulo;

        System.out.println(("A área total é: " + areaTotal));


teclado.close();

    }
}
