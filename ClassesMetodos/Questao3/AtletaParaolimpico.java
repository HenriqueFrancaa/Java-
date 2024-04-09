public class AtletaParaolimpico extends Atleta {

    private String necessidadeEspecial;

    public AtletaParaolimpico(int codigo, String nacionalidade, String nome, Esporte esporte, int indiceOlimpico, String necessidadeEspecial) {
        super(codigo, nacionalidade, nome, esporte, indiceOlimpico);
        this.necessidadeEspecial = necessidadeEspecial;
    }

    public String getNecessidadeEspecial() {
        return necessidadeEspecial;
    }

    public void setNecessidadeEspecial(String necessidadeEspecial) {
        this.necessidadeEspecial = necessidadeEspecial;
    }

    
}
