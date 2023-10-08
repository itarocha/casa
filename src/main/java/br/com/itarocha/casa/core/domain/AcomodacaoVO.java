package br.com.itarocha.casa.core.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AcomodacaoVO {
	private Long id;
	private Long quartoId;
	private Integer quartoNumero;
	private Long leitoId;
	private Integer leitoNumero;
}
