public class Paciente{
    String nome;
    String codigo;
    String data_nascimento;
    char sexo;
    String plano;
    String alergia;
    String tipo_sangue;

    public Paciente(String nome, String codigo, String data_nascimento, char sexo, String plano, String alergia, String tipo_sangue) {
        this.nome = nome;
        this.codigo = codigo;
        this.data_nascimento = data_nascimento;
        this.sexo = sexo;
        this.plano = plano;
        this.alergia = alergia;
        this.tipo_sangue = tipo_sangue;
    }

    public void modificar(String nome, String codigo, String data_nascimento, char sexo, String plano, String alergia, String tipo_sangue){
        this.nome = nome;
        this.codigo = codigo;
        this.data_nascimento = data_nascimento;
        this.sexo = sexo;
        this.plano = plano;
        this.alergia = alergia;
        this.tipo_sangue = tipo_sangue;   
    }
}