package br.com.itarocha.casa.core.domain;

import br.com.itarocha.casa.core.domain.enums.LogicoEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SituacaoLeito {
	private Long id;
	private String descricao;
	private LogicoEnum disponivel = LogicoEnum.S;

}
