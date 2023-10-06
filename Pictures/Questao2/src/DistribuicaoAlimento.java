// Classe DistribuicaoAlimento
public class DistribuicaoAlimento {
    private String descAlimento;
    private int quantidade;

    public DistribuicaoAlimento(String descAlimento, int quantidade) {
        this.descAlimento = descAlimento;
        this.quantidade = quantidade;
    }

    // Getters e Setters para os atributos

    public String getDescAlimento() {
        return descAlimento;
    }

    public void setDescAlimento(String descAlimento) {
        this.descAlimento = descAlimento;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // Método de validação de Projeto específico para DistribuicaoAlimento
    public boolean validaProjeto(String nomeProjeto) {
        return nomeProjeto != null && !nomeProjeto.isEmpty();
    }

    // Método para imprimir informações do Projeto específico para DistribuicaoAlimento
    public String imprimeProjeto() {
        return "Nome do Projeto: " + nomeProjeto + "\nDescrição: " + descricao + "\nData de Início: " + dataInicio
                + "\nData de Fim: " + dataFim + "\nDescrição do Alimento: " + descAlimento + "\nQuantidade: " + quantidade;
    }
}