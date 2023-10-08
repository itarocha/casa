package br.com.itarocha.casa.core.domain.enums;

public enum SexoEnum {

	M("Masculino"),
	F("Feminino");
	
	private String descricao;
	
	SexoEnum(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
}
