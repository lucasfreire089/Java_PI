import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        float sum = 0;
        float product = 1;
        int biggestNumber = Integer.MIN_VALUE;
        int lowerNumber = Integer.MAX_VALUE;

        boolean continueSet = true;

        while (continueSet) {
            System.out.println("Which number do you want to add to the whole? (Type '00' to stop)");
           number = input.nextInt();

                 if (number == 00 ){
                        continueSet = false;
                 } else{

                 if(number > biggestNumber){ // Atualizando o maior número
                  biggestNumber = number ;
                 }

                 if(number < lowerNumber){ // Atualizando o menor número
                     lowerNumber =   number;
                 }


            sum += number;
            product *= number;
                }
        }

        System.out.println(sum);
        System.out.println(product);
        System.out.println(lowerNumber);
        System.out.println(biggestNumber);

        input.close();

    }
    
}
