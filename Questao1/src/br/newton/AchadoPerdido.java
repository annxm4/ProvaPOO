package br.newton;

public class AchadoPerdido extends Publicacao {
    private String descricao;
    private String foto;
    private String tipo;
    private String localAchado;
    private String dataHora;
    private String status;

    public AchadoPerdido(String titulo, String descricao, String tipo, String status) {
        super(titulo);
        this.descricao = descricao;
        this.tipo = tipo;
        this.status = status;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Implemente getters e setters para os demais atributos

    public void completaDados(String foto, String localAchado, String dataHora) {
        // Implemente a lógica para completar os dados
    }

    @Override
    public void buscarTitulo(String titulo) {
        // Implemente a lógica para buscar o título em AchadoPerdido
    }

    @Override
    public void visualizarDetalhes() {
        // Implemente a lógica para visualizar os detalhes em AchadoPerdido
    }
}

    public String getTitulo() {
        return titulo;
    }
    public String getDescricao() {
        return descricao;
    }
    public String getFoto() {
        return foto;
    }
    public String getTipo() {
        return tipo;
    }
    public String getLocalAchado() {
        return localAchado;
    }
    public String getDataHora() {
        return dataHora;
    }
    public String getStatus() {
        return status;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setFoto(String foto) {
        this.foto = foto;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setLocalAchado(String localAchado) {
        this.localAchado = localAchado;
    }
    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}
