package org.example;

import java.util.ArrayList;
import java.util.List;

public class SubProjeto extends ComponenteProjeto {

    private List<ComponenteProjeto> componentes;

    public SubProjeto(String descricao) {
        super(descricao);
        this.componentes = new ArrayList<>();
    }

    public void addComponente(ComponenteProjeto componente) {
        this.componentes.add(componente);
    }

    @Override
    public String getDetalhes() {
        String saida = "Subprojeto: " + this.getDescricao() + "\n";
        for (ComponenteProjeto componente : componentes) {
            saida += componente.getDetalhes();
        }
        return saida;
    }
}
