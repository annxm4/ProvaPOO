// Classe TrabalhoVoluntario
public class TrabalhoVoluntario {
    private String tipoTrabalho;
    private int duracaoTrabalho;

    public TrabalhoVoluntario(String tipoTrabalho, int duracaoTrabalho) {
        this.tipoTrabalho = tipoTrabalho;
        this.duracaoTrabalho = duracaoTrabalho;
    }

    // Getters e Setters para os atributos

    public String getTipoTrabalho() {
        return tipoTrabalho;
    }

    public void setTipoTrabalho(String tipoTrabalho) {
        this.tipoTrabalho = tipoTrabalho;
    }

    public int getDuracaoTrabalho() {
        return duracaoTrabalho;
    }

    public void setDuracaoTrabalho(int duracaoTrabalho) {
        this.duracaoTrabalho = duracaoTrabalho;
    }

    // Método de validação de Projeto específico para TrabalhoVoluntario
    public boolean validaProjeto(String nomeProjeto) {
        return duracaoTrabalho > 2;
    }

    // Método para imprimir informações do Projeto específico para TrabalhoVoluntario
    public String imprimeProjeto() {
        return "Nome do Projeto: " + nomeProjeto + "\nDescrição: " + descricao + "\nData de Início: " + dataInicio
                + "\nData de Fim: " + dataFim + "\nTipo de Trabalho: " + tipoTrabalho + "\nDuração do Trabalho: "
                + duracaoTrabalho;
    }
}