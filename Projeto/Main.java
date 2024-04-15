import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Time t1 = new Time("UNICAP", "Ivna");
        Scanner scan = new Scanner(System.in);
        t1.TimeCreate(scan);
        System.out.println(t1.jogadores);
        Time t2 = new Time("FRKS","Franca");
        t2.TimeCreate(scan);
        scan.close();


    }
}