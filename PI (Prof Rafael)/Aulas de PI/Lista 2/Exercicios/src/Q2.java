import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

Scanner input = new Scanner(System.in);
System.out.println("Qual foi a quantidade de chuvas em polegadas?");
int quantidade = input.nextInt();
double converter = quantidade * 24.04;
System.out.println("A quantidade de chuva foi de: " + converter + "mm");
input.close();

        
    }
}
