public class Main{
    public static void main(String[] args){
        Endereco endereco = new Endereco("FRANCAS", "777", "Casa com ferrari", "Janga", "Paulista", "PE", "7777-777");
        Medico medico = new Medico("Yoru", "2873", "M", "Cardiologista", endereco);

        System.out.println("Medico: " + medico.nome);
        System.out.println("Codigo: " + medico.codigo);
        System.out.println("Sexo: " + medico.sexo);
        System.out.println("Especialidade: " + medico.codigo);
        System.out.print("\n");
        System.out.println("Rua: "+ medico.endereco.rua);
        System.out.println("Numero: "+ medico.endereco.numero);
        System.out.println("Complemento: "+ medico.endereco.complemento);
        System.out.println("Bairro: "+ medico.endereco.bairro);
        System.out.println("Cidade: "+ medico.endereco.cidade);
        System.out.println("UF: "+ medico.endereco.uf);
        System.out.println("CEP: "+ medico.endereco.cep);
    }
}