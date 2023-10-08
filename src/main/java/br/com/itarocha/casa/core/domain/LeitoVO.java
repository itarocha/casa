package br.com.itarocha.casa.core.domain;

import br.com.itarocha.casa.adapter.out.persistence.jpa.entity.TipoLeitoEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LeitoVO {
	private Long id;
	private Integer numero;
	private Long quartoId;
	private Integer quartoNumero;
	private TipoLeitoEntity tipoLeitoEntity;
}

