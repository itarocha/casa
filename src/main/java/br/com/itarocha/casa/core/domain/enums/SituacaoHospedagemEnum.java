package br.com.itarocha.casa.core.domain.enums;

public enum SituacaoHospedagemEnum {

	A("Aberta"),
	F("Finalizada");
	
	private String descricao;
	
	SituacaoHospedagemEnum(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
}
