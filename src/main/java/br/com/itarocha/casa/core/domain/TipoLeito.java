package br.com.itarocha.casa.core.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TipoLeito {
	private Long id;
	private String descricao;
	private Integer quantidadeCamas;
}
