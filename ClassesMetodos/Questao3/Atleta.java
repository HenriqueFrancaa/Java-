public class Atleta {

    private int codigo;
    private String nacionalidade;
    private String nome;
    private int recorde;
    private Esporte esporte;
    private int indiceOlimpico;


    public Atleta(int codigo, String nacionalidade, String nome, Esporte esporte, int indiceOlimpico) {
        this.codigo = codigo;
        this.nacionalidade = nacionalidade;
        this.nome = nome;
        this.esporte = esporte;
        this.indiceOlimpico = indiceOlimpico;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRecorde() {
        return recorde;
    }

    public void setRecorde(int recorde) {
        if (recorde > 0) {
            this.recorde = recorde;
        } else {
            System.out.println("Recorde menor ou igual a zero!");
        }
    }

    public Esporte getEsporte() {
        return esporte;
    }

    public void setEsporte(Esporte esporte) {
        this.esporte = esporte;
    }

    public int getIndiceOlimpico() {
        return indiceOlimpico;
    }

    public void setIndiceOlimpico(int indiceOlimpico) {
        this.indiceOlimpico = indiceOlimpico;
    }
    
}