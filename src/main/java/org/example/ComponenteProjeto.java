package org.example;

public abstract class ComponenteProjeto {

    private String descricao;

    public ComponenteProjeto(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public abstract String getDetalhes();
}
