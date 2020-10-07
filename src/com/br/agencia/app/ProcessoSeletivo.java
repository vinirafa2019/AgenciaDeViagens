package com.br.agencia.app;

import java.io.IOException;

import com.br.agencia.pojo.Candidato;
import com.br.agencia.pojo.Empresa;
import com.br.agencia.processor.constant.StatusProcessoSeletivo;

public class ProcessoSeletivo {

	public static void main(String[] args) throws IOException {
	
		Empresa.cadastrarVagas();
		
		Candidato.consultarVagas();
		Candidato.candidatarVagas(0);
		Candidato.acompanharProcesso(StatusProcessoSeletivo.APROVADO);
		
		Empresa.consultarCandidato(); 
//		Empresa.gerenciaProcessos();
		
		//System.out.println("Tela Funcionario: ");
		//Funcionario.cadastrarVagas();
		//Funcionario.consultarCandidato(candidato);
		//Funcionario.gerenciaProcessos();

		
		
	}

}