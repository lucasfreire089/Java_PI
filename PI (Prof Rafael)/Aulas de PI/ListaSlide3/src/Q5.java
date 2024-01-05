import java.util.Scanner;

public class Q5{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //  System.out.println("digite um numero");
        int numero = teclado.nextInt();
        
         int fatoração = 1;
         int i = 1;

        while (numero >=i){
           
            fatoração *= i;
            i ++;
        // } System.out.println(fatoração);



teclado.close();

    }

    }
}