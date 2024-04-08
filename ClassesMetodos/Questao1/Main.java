
public class Main {
    public static void main(String[] args){
        Paciente p1 = new Paciente("Franca", "777", "23/03/2005", 'M', "Esperança", "Nao tem", "O+");
        System.out.println("Nome: " + p1.nome);
        System.out.println("Codigo: " + p1.codigo);
        System.out.println("Nascimento: " + p1.data_nascimento);
        System.out.println("Sexo: " + p1.sexo);
        System.out.println("Plano: " + p1.plano);
        System.out.println("Alergia: " + p1.alergia);
        System.out.println("Tipo sanguineo: " + p1.tipo_sangue);
        
    }

}
