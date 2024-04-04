package questao2;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        float x,y, novo_valor;
        x = scan.nextFloat();
        y = scan.nextFloat();
        scan.close();

        System.out.println("Valor : " + x);
        System.out.println("Porcentagem: " + y);

        novo_valor = (y/x)*100;

        System.out.println("Valor depois da porcentagem : " + novo_valor);
        
    }
}
