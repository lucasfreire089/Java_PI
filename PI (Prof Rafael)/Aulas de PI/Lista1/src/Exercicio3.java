import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        String marca1, marca2, marca3;
        
        System.out.println(
            "Digite a primeira marca:"); 
        marca1 = teclado.nextLine();
        System.out.println(
            "Digite a segunda marca:");
        marca2 = teclado.nextLine();
        System.out.println(
            "Digite a terceira marca:");
        marca3 = teclado.nextLine();
       
         teclado.close();

            System.out.println(
                "A marca 1 é: " + marca1);
            System.out.println(
                "A marca 2 é: " + marca2);
            System.out.println(
                "A marca 3 é: " + marca3);
        
    }
    
}
