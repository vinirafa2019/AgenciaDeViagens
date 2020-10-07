package com.br.agencia.pojo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

import com.br.agencia.processor.constant.StatusProcessoSeletivo;

public class Candidato{

	private String nomeCompleto;
	private String cpf;
	private String rg;
	private String email;
	private String idade;
	private Empresa consulta;
	
	@Autowired
	private List<Vagas> listavagas;

	private StatusProcessoSeletivo statusProcessoSeletivo;

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public StatusProcessoSeletivo getStatusProcessoSeletivo() {
		return statusProcessoSeletivo;
	}

	public void setStatusProcessoSeletivo(StatusProcessoSeletivo statusProcessoSeletivo) {
		this.statusProcessoSeletivo = statusProcessoSeletivo;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public void consultarVagas() {
			System.out.println("Consultar vagas");
					
			if(listavagas.isEmpty()){
	              System.out.println("Não existem vagas");
	            }else{
	              System.out.println(listavagas.toString());
	            }
	}
	
	public void candidatarVagas() {

		Scanner sc = new Scanner(System.in);
		Candidato candidato;
		List<Candidato> listaCandidatos = new ArrayList<Candidato>();


		int opcao = 0;

		do {
			System.out.println("## Candidato escolha uma das opções abaixo ##");
			System.out.println("Opção 1 - Candidatar-se em vagas");
			System.out.println("Opção 0 - Sair do programa");
			System.out.println("_______________________");

			System.out.print("Digite aqui sua opção: ");
			opcao = Integer.parseInt(sc.nextLine());

			if (opcao == 1) {
				// Cria um novo objeto
				candidato = new Candidato();

				System.out.print("Digite o nome completo: ");
				candidato.setNomeCompleto(sc.nextLine());

				System.out.print("Digite o CPF: ");
				candidato.setCpf(sc.nextLine());

				System.out.print("Digite o Email: ");
				candidato.setEmail(sc.nextLine());

				System.out.print("Digite a idade: ");
				candidato.setIdade(sc.nextLine());

				System.out.print("Digite a RG: ");
				candidato.setRg(sc.nextLine());
				



				//System.out.println("\n Você foi cadastrado na vaga: " + consulta.size());

				// Guarda o objeto pessoa em uma lista.
				listaCandidatos.add(candidato);
			}
		} while (opcao != 0);

	}



	@Override
	public String toString() {

		String m = "Nome Completo: " + nomeCompleto;
		m += ", CPF: " + cpf;
		m += ", Email: " + email;
		m += ", Idade: " + idade;
		m += ", RG: " + rg;
		m += ", Vagas: " + consulta;

		return m;
	}

}


