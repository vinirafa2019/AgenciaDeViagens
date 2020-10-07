package com.br.agencia.processor.constant;

public enum StatusProcessoSeletivo {

	EM_PROCESSO("Em processo"),
	APROVADO("Aprovado"), 
	REPROVADO("Reprovado");

    private String descricao;

    StatusProcessoSeletivo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
