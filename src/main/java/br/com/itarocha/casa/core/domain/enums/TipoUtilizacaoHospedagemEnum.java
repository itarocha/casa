package br.com.itarocha.casa.core.domain.enums;

public enum TipoUtilizacaoHospedagemEnum {

	T("Total"),
	P("Parcial");
	
	private String descricao;
	
	TipoUtilizacaoHospedagemEnum(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
}
