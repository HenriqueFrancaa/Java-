import java.util.ArrayList;
import java.util.Scanner;

public class Time {
    String nome;
    ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
    String tecnico;

    public Time(String nome, String tecnico) {
        this.nome = nome;
        this.tecnico = tecnico;
    }

    public void adicionarJogador(Jogador jogador){
        jogadores.add(jogador);
    }

    public void TimeCreate(Scanner scan){
        for(int i = 0; i < 11; i++){
            String nome = scan.nextLine();
            int idade = scan.nextInt();
            int camisa = scan.nextInt();
            String posicao = scan.nextLine();
            String nacionalidade = scan.nextLine();
            Jogador jogador = new Jogador(nome, idade, camisa, posicao, nacionalidade);
            adicionarJogador(jogador);
        }
    }

}
