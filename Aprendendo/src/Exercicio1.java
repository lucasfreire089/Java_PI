import java.util.Date;
import java.util.Locale;
import java.awt.Dimension;
import java.awt.Toolkit;

public class Exercicio1 { 
    public static void main(String[]args){
  Date relogio = new Date(); 
  Locale localização = Locale.getDefault();
  Toolkit tk = Toolkit.getDefaultToolkit();
  Dimension d = tk.getScreenSize();

   
  System.out.println("A hora do sistema é: " + relogio.toString());
  System.out.println("O idioma do sistema é: " + localização.getDisplayLanguage());
  System.out.println("A resolução do sistema é: " + d.width + " X " + d.height);


    }
}
