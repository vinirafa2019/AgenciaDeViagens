package com.br.agencia.pojo;

import com.br.agencia.processor.constant.StatusProcessoSeletivo;

public interface EstrategiaDeNotificacao {

	//fazer metodos
	//public  String retornaEstado(String estado);


	StatusProcessoSeletivo retornaEstado(StatusProcessoSeletivo estado);
		
}
