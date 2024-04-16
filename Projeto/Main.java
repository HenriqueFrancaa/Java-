import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Time t1 = new Time("UNICAP", "Ivna");
        Scanner scan = new Scanner(System.in);
        t1.TimeCreate(scan);
        System.out.println("TIME FORMADO: " + t1.nome);
        System.out.println("Tecnico " + t1.tecnico);
        for(int i = 0; i < 11; i++){
            System.out.println(t1.jogadores.get(i).nome + ",camisa " + t1.jogadores.get(i).camisa);
        }
        /*
        
        Time t2 = new Time("FRKS","Franca");
        t2.TimeCreate(scan);
        */
        scan.close();

        

    }
}