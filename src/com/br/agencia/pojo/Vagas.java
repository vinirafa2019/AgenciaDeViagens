package com.br.agencia.pojo;

import com.br.agencia.processor.constant.StatusProcessoSeletivo;

public class Vagas {

	private String descricao;
	private String descricaoEmpresa;
	private String descSalario;
	private StatusProcessoSeletivo status;

	public StatusProcessoSeletivo getStatus() {
		
		return status;
	}

	public void setStatus(StatusProcessoSeletivo status) {
		this.status = status;
	}

	public String getDescSalario() {
		return descSalario;
	}

	public void setDescSalario(String descSalario) {
		this.descSalario = descSalario;
	}

	public String getDescricaoEmpresa() {
		return descricaoEmpresa;
	}

	public void setDescricaoEmpresa(String descricaoEmpresa) {
		this.descricaoEmpresa = descricaoEmpresa;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	
	@Override
	public String toString() {

		String m = "Cargo: " + descricao;
		m += ", Nome Empresa: " + descricaoEmpresa;
		m += ", Salario: " + descSalario;

		return m;
	}
}
