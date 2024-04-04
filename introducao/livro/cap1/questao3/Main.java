package questao3;
import java.util.Scanner;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x,y;
        x = scan.nextInt();
        y = scan.nextInt();
        scan.close();
        int maior = Math.max(x,y);
        System.out.println("Entres os valores: [" + x + "," +y + "] o maior é " + maior);
    }
}
