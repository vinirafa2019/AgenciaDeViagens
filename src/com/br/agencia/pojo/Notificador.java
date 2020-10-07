package com.br.agencia.pojo;

import com.br.agencia.processor.constant.StatusProcessoSeletivo;

public class Notificador implements EstrategiaDeNotificacao {

	@Override
	public StatusProcessoSeletivo retornaEstado(StatusProcessoSeletivo estado) {
		if (estado == StatusProcessoSeletivo.EM_PROCESSO) {
			System.out.println("Curriculo ainda em analise...");
		}
		if (estado == StatusProcessoSeletivo.APROVADO) {
			System.out.println("Parabens você foi aprovado,favor en caminhar os documentos");
		}
		if (estado == StatusProcessoSeletivo.REPROVADO) {
			System.out.println("Desculpe mas infelizmente você não foi aprovado");
		}
		
		return estado;
	}

	

}
