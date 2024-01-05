import java.util.Scanner;

public class q19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual o código do produto comprado (número inteiro entre 0 e 10)");
            int codigoProduto = teclado.nextInt();
        System.out.println("Qual o peso do produto? Em quilos.");
            float pesoProduto = teclado.nextFloat();
        System.out.println("Qual o código do país de origem?");
            int codigoOrigem = teclado.nextInt();
                    float preçoSemImposto = 0;
                    float imposto = 0;

            float conversaoPeso = pesoProduto * 100f;
                 System.out.printf("O peso convertido é de %.2f gramas \n", conversaoPeso);
        
        switch (codigoProduto) {
                case 1:
                case 2:
                case 3:
                case 4:
                    preçoSemImposto = conversaoPeso * 10;
                    break;
                    
                case 5:
                case 6:
                case 7:
                    preçoSemImposto = conversaoPeso * 25;

                case 8:
                case 9: 
                case 10:
                    preçoSemImposto = conversaoPeso * 35;
                
                    default:
                    break;
        }
        System.out.println("O preço sem impostos é de: " + preçoSemImposto + "R$ \n");

        switch (codigoOrigem) {
            case 1:
            imposto = 0 * preçoSemImposto;
                break;
            
            case 2:
            imposto = 0.15f * preçoSemImposto;
                break;
            
            case 3: 
            imposto =  0.25f * preçoSemImposto;
                break;
        
            default:
                break;
        }

        float preçoTotal = imposto + preçoSemImposto;

        System.out.printf("O preço total é de: %.2f R$", preçoTotal);
          



        teclado.close();
    }
}
