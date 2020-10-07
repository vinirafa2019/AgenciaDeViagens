package com.br.agencia.app;

import java.io.IOException;

import com.br.agencia.pojo.Candidato;
import com.br.agencia.pojo.Empresa;
import com.br.agencia.processor.constant.StatusProcessoSeletivo;

public class ProcessoSeletivo {

	public static void main(String[] args) throws IOException {
		 Candidato candidato= new Candidato();
		
		 Empresa.cadastrarVagas();
		
		System.out.println("Tela Usuario: ");
		candidato.consultarVagas();
		candidato.candidatarVagas();
		candidato.setStatusProcessoSeletivo(StatusProcessoSeletivo.APROVADO);
		
		System.out.println("Tela Empresa: ");
		Empresa.consultarCandidato(candidato); 
		Empresa.gerenciaProcessos(candidato);
		
		//System.out.println("Tela Funcionario: ");
		//Funcionario.cadastrarVagas();
		//Funcionario.consultarCandidato(candidato);
		//Funcionario.gerenciaProcessos();

		
		
	}

}