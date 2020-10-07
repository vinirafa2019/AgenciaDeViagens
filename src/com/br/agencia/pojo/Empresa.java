package com.br.agencia.pojo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.br.agencia.processor.constant.StatusProcessoSeletivo;

public class Empresa {

	public static List<Vagas> cadastrarVagas() {

		List<Vagas> listaVagas = new ArrayList<Vagas>();
			Scanner sc = new Scanner(System.in);
			Vagas vaga;
			int opcao = 0;

			do {
				System.out.println("## Empresa escolha uma das opções abaixo ##");
				System.out.println("Opção 1 - Cadastre a vaga");
				System.out.println("Opção 2 - Listar vagas");
				System.out.println("Opção 0 - Sair do programa");
				System.out.println("_______________________");

				System.out.print("Digite aqui sua opção: ");
				opcao = Integer.parseInt(sc.nextLine());

				if (opcao == 1) {
					// Cria um novo objeto
					vaga = new Vagas();

					System.out.print("Informe a descricao da vaga: ");
					vaga.setDescricao(sc.nextLine());

					System.out.print("Informe a descricao da empresa ");
					vaga.setDescricaoEmpresa(sc.nextLine());

					System.out.print("Informe o salario: ");
					vaga.setDescSalario(sc.nextLine());
					
					vaga.getStatus();
					

					System.out.println("Vaga cadastrada \n");

					// Guarda o objeto pessoa em uma lista.
					listaVagas.add(vaga);
				}else if (opcao == 2) {
										
					if (listaVagas.isEmpty()) {
						System.out.println("Não existem vagas cadastradas, pressione o 0 para sair");
						sc.nextLine();
					} else {
						System.out.println("Lista de vagas: " + listaVagas.toString());
						
						sc.nextLine();
					}
				}
			} while (opcao != 0);
		return listaVagas;
	}
	
	public static Candidato consultarCandidato(Candidato candidato){				
		System.out.println("Lista de Candidatos"+candidato.toString());
		return (Candidato) candidato;

	}
	public static void gerenciaProcessos(Candidato candidato) {
		
		
		if(candidato.equals(StatusProcessoSeletivo.APROVADO)) {
			System.out.println("Resultado do processo seletivo do "+candidato.getNomeCompleto()+" foi: "+candidato.getStatusProcessoSeletivo());
		}
		if(candidato.equals(StatusProcessoSeletivo.REPROVADO)) {
			System.out.println("Resultado do processo seletivo foi: "+candidato.getStatusProcessoSeletivo());
		}
		if(candidato.equals(StatusProcessoSeletivo.EM_PROCESSO)) {
			System.out.println("Resultado do processo seletivo foi: "+candidato.getStatusProcessoSeletivo());
		}
	}
}
