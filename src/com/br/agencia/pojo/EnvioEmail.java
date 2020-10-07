package com.br.agencia.pojo;

import com.br.agencia.processor.constant.StatusProcessoSeletivo;

public class EnvioEmail implements EstrategiaDeNotificacao{



	@Override
	public StatusProcessoSeletivo retornaEstado(StatusProcessoSeletivo estado) {
		System.out.println("Mesangens de :"+estado);
		return estado;
	}
}
