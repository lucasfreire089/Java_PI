import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Which number do you want to print for the sequence?");
        int number = input.nextInt();

        int firstNumber = 0;
        int SecondNumber = 1;


  for (int i = 1; i <= number; i++){
        if( i == 0){
        System.out.println(firstNumber);
 
   }
   else if ( i == 1 )
   {
    System.out.printf("", SecondNumber);
   }
    
   else {
         int nextNumber = firstNumber + SecondNumber;
            System.out.printf("," + nextNumber);


    firstNumber = SecondNumber;
    SecondNumber = nextNumber;

   }       
    
    
    }
}
    
}
