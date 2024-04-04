package questao1;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int x,y;
        Scanner leitor = new Scanner(System.in);    
        x = leitor.nextInt();
        y = leitor.nextInt();
        leitor.close();
        System.out.println("A SOMA É: " + (x + y));
        System.out.println("A MULTIPLICACAO É: " + (x * y));
    }
}