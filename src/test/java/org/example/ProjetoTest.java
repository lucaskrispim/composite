package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProjetoTest {

    @Test
    void deveRetornarEspecificacaoProjeto() {
        SubProjeto subprojeto1 = new SubProjeto("Planejamento Inicial");

        SubProjeto subprojeto2 = new SubProjeto("Desenvolvimento");
        Tarefa tarefa21 = new Tarefa("Implementar API", 40);
        subprojeto2.addComponente(tarefa21);

        SubProjeto subprojeto3 = new SubProjeto("Teste e Integração");
        Tarefa tarefa31 = new Tarefa("Teste Unitário", 20);
        Tarefa tarefa32 = new Tarefa("Teste de Integração", 30);
        subprojeto3.addComponente(tarefa31);
        subprojeto3.addComponente(tarefa32);

        SubProjeto especificacao = new SubProjeto("Projeto Completo");
        especificacao.addComponente(subprojeto1);
        especificacao.addComponente(subprojeto2);
        especificacao.addComponente(subprojeto3);

        Projeto projeto = new Projeto();
        projeto.setEspecificacao(especificacao);

        assertEquals("Subprojeto: Projeto Completo\n" +
                "Subprojeto: Planejamento Inicial\n" +
                "Subprojeto: Desenvolvimento\n" +
                "Tarefa: Implementar API - duração: 40 horas\n" +
                "Subprojeto: Teste e Integração\n" +
                "Tarefa: Teste Unitário - duração: 20 horas\n" +
                "Tarefa: Teste de Integração - duração: 30 horas\n", projeto.getEspecificacao());
    }

    @Test
    void deveRetornarExcecaoProjetoSemEspecificacao() {
        try {
            Projeto projeto = new Projeto();
            projeto.getEspecificacao();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Projeto sem especificação", e.getMessage());
        }
    }
}