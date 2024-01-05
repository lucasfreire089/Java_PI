// O cardápio de uma lanchonete é dado abaixo. Prepare
// um algoritmo que leia a quantidade de cada item que
// você consumiu e calcule a conta final.
// Hambúrguer................. R$ 3,00
// Cheeseburger.............. R$ 2,50
// Fritas............................ R$ 2,50
// Refrigerante................. R$ 1,00
// Milkshake..................... R$ 3,00          

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    boolean continuarPedido = true;


    while(continuarPedido){
        System.out.println("Qual seu pedido?");
        String pedido = teclado.nextLine();

        System.out.println("Quantos?");
        int quantidade = teclado.nextInt();

        double totalPedido = calcularTotal(pedido, quantidade);
        System.out.println("O valor a ser pago é: " + totalPedido);

        System.out.println("Deseja fazer mais algum pedido? (S para sim ou N para não)");
        String finalizar = teclado.nextLine();


        if (finalizar.equalsIgnoreCase("N")){
            continuarPedido = false;
    }

    

    }
    System.out.println("Mercearia Tio Peixe agradece!");
    teclado.close();

    }

    
    private static double calcularTotal(String produto, int quantidade){
        double valorUnitario = 0.0;

        switch (produto.toLowerCase()) {
            case "hamburguer":
            valorUnitario = 3.00;
                
                break;
            case "cheeseburger":
            valorUnitario = 2.50;

                break;

            case "fritas": 
            valorUnitario = 2.50;

                break;
            
            case "refrigerante":
            valorUnitario = 1.00;

                break;

            case "milkshake":
            valorUnitario = 3.00;

            break;

        
            default: System.out.println("ERROR");
                break;
        } return valorUnitario * quantidade;
    

        
    }
}
