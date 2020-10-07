package com.br.agencia.pojo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.br.agencia.processor.constant.StatusProcessoSeletivo;

public class Candidato {

	private String nomeCompleto;
	private String cpf;
	private String rg;
	private String email;
	private String idade;
	private Empresa consulta;
	private static List<Candidato> candidatosCadastrados;	

	public static List<Candidato> getCandidatosCadastrados() {
		return candidatosCadastrados;
	}

	public static void setCandidatosCadastrados(List<Candidato> candidatosCadastrados) {
		Candidato.candidatosCadastrados = candidatosCadastrados;
	}

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

	public static void consultarVagas() {

		System.out.println("Vagas disponiveis");
		Empresa.listarVagas();
	}

	public static void candidatarVagas(int i) {

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

				System.out.println("Informações do candidato: \n");
				
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
				
				// System.out.println("\n Você foi cadastrado na vaga: " + consulta.size());
				System.out.println("Digite o carga da Vaga que quer se candidatar");
				opcao = Integer.parseInt(sc.nextLine());
				if (opcao % 4 == 0) {
					List<Vagas> v = Empresa.getListavagasdiponiveis();
					System.out.println("vagas candidatadas: " + v.get(0) + " " + StatusProcessoSeletivo.APROVADO);
				}System.out.println("Cadastrado!");
				// Guarda o objeto pessoa em uma lista.
				listaCandidatos.add(candidato);
			}
		} while (opcao != 0);
		candidatosCadastrados=listaCandidatos;
	}

	public static void acompanharProcesso(StatusProcessoSeletivo estado) {

		if (estado == StatusProcessoSeletivo.EM_PROCESSO) {
			System.out.println("Curriculo ainda em analise...");
		} else if (estado == StatusProcessoSeletivo.APROVADO) {
			System.out.println("Parabens você foi aprovado,favor encaminhar os documentos");
		} else if (estado == StatusProcessoSeletivo.REPROVADO) {
			System.out.println("Desculpe mas infelizmente você não foi aprovado");
		}

	}

	@Override
	public String toString() {

		String m = "Nome Completo: " + nomeCompleto;
		m += ", CPF: " + cpf;
		m += ", Email: " + email;
		m += ", Idade: " + idade;
		m += ", RG: " + rg;


		return m;
	}

}
