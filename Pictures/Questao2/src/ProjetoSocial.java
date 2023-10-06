// Classe ProjetoSocial
public class ProjetoSocial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1- Distribuição de Alimentos");
            System.out.println("2- Trabalho Voluntário");
            System.out.println("3- Sair");

            int escolha = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            if (escolha == 3) {
                System.out.println("Saindo...");
                break;
            }

            String nomeProjeto, descricao, ocorrencia, dataInicio, dataFim;
            System.out.println("Digite o nome do projeto:");
            nomeProjeto = scanner.nextLine();
            System.out.println("Digite a descrição do projeto:");
            descricao = scanner.nextLine();
            System.out.println("Digite a ocorrência do projeto:");
            ocorrencia = scanner.nextLine();
            System.out.println("Digite a data de início do projeto:");
            dataInicio = scanner.nextLine();
            System.out.println("Digite a data de fim do projeto:");
            dataFim = scanner.nextLine();

            if (escolha == 1) {
                System.out.println("Digite a descrição do alimento:");
                String descAlimento = scanner.nextLine();
                System.out.println("Digite a quantidade de alimentos:");
                int quantidade = scanner.nextInt();

                DistribuicaoAlimento distribuicaoAlimento = new DistribuicaoAlimento(descAlimento, quantidade);
                distribuicaoAlimento.setNomeProjeto(nomeProjeto);
                distribuicaoAlimento.setDescricao(descricao);
                distribuicaoAlimento.setOcorrencia(ocorrencia);
                distribuicaoAlimento.setDataInicio(dataInicio);
                distribuicaoAlimento.setDataFim(dataFim);

                if (distribuicaoAlimento.validaProjeto(nomeProjeto)) {
                    System.out.println(distribuicao