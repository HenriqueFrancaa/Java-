import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a identificação do esporte:");
        int idEsporte = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Digite a descrição do esporte:");
        String descricaoEsporte = scanner.nextLine();
        Esporte esporte = new Esporte(idEsporte, descricaoEsporte);

        System.out.println("Digite o código do atleta olímpico:");
        int codigoAtletaOlimpico = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Digite a nacionalidade do atleta olímpico:");
        String nacionalidadeAtletaOlimpico = scanner.nextLine();
        System.out.println("Digite o nome do atleta olímpico:");
        String nomeAtletaOlimpico = scanner.nextLine();
        System.out.println("Digite o recorde do atleta olímpico:");
        int recordeAtletaOlimpico = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Digite o índice olímpico do atleta olímpico:");
        int indiceOlimpicoAtletaOlimpico = scanner.nextInt();
        scanner.nextLine(); 
        Atleta atletaOlimpico = new AtletaOlimpico(codigoAtletaOlimpico, nacionalidadeAtletaOlimpico, nomeAtletaOlimpico, esporte, indiceOlimpicoAtletaOlimpico);
        atletaOlimpico.setRecorde(recordeAtletaOlimpico);

        System.out.println("Digite o código do atleta paralímpico:");
        int codigoAtletaParaolimpico = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Digite a nacionalidade do atleta paralímpico:");
        String nacionalidadeAtletaParaolimpico = scanner.nextLine();
        System.out.println("Digite o nome do atleta paralímpico:");
        String nomeAtletaParaolimpico = scanner.nextLine();
        System.out.println("Digite o recorde do atleta paralímpico:");
        int recordeAtletaParaolimpico = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Digite o índice paralímpico do atleta paralímpico:");
        int indiceParaolimpicoAtletaParaolimpico = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Digite a necessidade especial do atleta paralímpico:");
        String necessidadeEspecialAtletaParaolimpico = scanner.nextLine();
        Atleta atletaParaolimpico = new AtletaParaolimpico(codigoAtletaParaolimpico, nacionalidadeAtletaParaolimpico, nomeAtletaParaolimpico, esporte, indiceParaolimpicoAtletaParaolimpico, necessidadeEspecialAtletaParaolimpico);
        atletaParaolimpico.setRecorde(recordeAtletaParaolimpico);

        if (atletaOlimpico.getRecorde() > 100) {
            System.out.println(atletaOlimpico.getNome() + " está apto para participar das Olimpíadas.");
        } else {
            System.out.println(atletaOlimpico.getNome() + " não está apto para participar das Olimpíadas.");
        }

        if (atletaParaolimpico.getRecorde() > 60) {
            System.out.println(atletaParaolimpico.getNome() + " está apto para participar das Paraolimpíadas.");
        } else {
            System.out.println(atletaParaolimpico.getNome() + " não está apto para participar das Paraolimpíadas.");
        }

        scanner.close();
    }
}
