public class Jogador {
    String nome;
    int idade;
    int camisa;
    String posicao;
    String nacionalidade;
    int gols;
    int assistencias;

    public Jogador(String nome, int idade, int camisa, String posicao, String nacionalidade) {
        this.nome = nome;
        this.idade = idade;
        this.camisa = camisa;
        this.posicao = posicao;
        this.nacionalidade = nacionalidade;
        this.gols = 0;
        this.assistencias = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getCamisa() {
        return camisa;
    }

    public String getPosicao() {
        return posicao;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public int getGols() {
        return gols;
    }

    public int getAssistencias() {
        return assistencias;
    }

    
    
}
