package org.example;

public class Tarefa extends ComponenteProjeto {

    private int duracaoHoras;

    public Tarefa(String descricao, int duracaoHoras) {
        super(descricao);
        this.duracaoHoras = duracaoHoras;
    }

    public int getDuracaoHoras() {
        return duracaoHoras;
    }

    public void setDuracaoHoras(int duracaoHoras) {
        this.duracaoHoras = duracaoHoras;
    }

    @Override
    public String getDetalhes() {
        return "Tarefa: " + this.getDescricao() + " - duração: " + this.duracaoHoras + " horas\n";
    }
}
