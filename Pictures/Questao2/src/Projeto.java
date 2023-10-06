// Classe Projeto
public class Projeto {
    private String nomeProjeto;
    private String descricao;
    private String ocorrencia;
    private String dataInicio;
    private String dataFim;

    public Projeto(String nomeProjeto, String descricao, String ocorrencia, String dataInicio, String dataFim) {
        this.nomeProjeto = nomeProjeto;
        this.descricao = descricao;
        this.ocorrencia = ocorrencia;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    // Getters e Setters para os atributos

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getOcorrencia() {
        return ocorrencia;
    }

    public void setOcorrencia(String ocorrencia) {
        this.ocorrencia = ocorrencia;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    // Método de validação de Projeto
    public boolean validaProjeto() {
        return nomeProjeto != null && !nomeProjeto.isEmpty() && dataFim.isEmpty();
    }

    // Método para imprimir informações do Projeto
    public String imprimeProjeto() {
        return "Nome do Projeto: " + nomeProjeto + "\nDescrição: " + descricao + "\nData de Início: " + dataInicio
                + "\nData de Fim: " + dataFim;
    }
}

