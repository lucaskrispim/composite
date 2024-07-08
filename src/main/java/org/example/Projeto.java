package org.example;

public class Projeto {

    private ComponenteProjeto especificacao;

    public void setEspecificacao(ComponenteProjeto especificacao) {
        this.especificacao = especificacao;
    }

    public String getEspecificacao() {
        if (this.especificacao == null) {
            throw new NullPointerException("Projeto sem especificação");
        }
        return this.especificacao.getDetalhes();
    }
}
