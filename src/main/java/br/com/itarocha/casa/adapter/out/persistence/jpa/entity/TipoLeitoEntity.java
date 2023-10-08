package br.com.itarocha.casa.adapter.out.persistence.jpa.entity;

import br.com.itarocha.casa.adapter.out.persistence.audit.UserDateAudit;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name="tipo_leito")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TipoLeitoEntity extends UserDateAudit implements Serializable {

	private static final long serialVersionUID = -732012434360084121L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message="Descrição é obrigatória")
	@Size(max = 32, message="Descrição da Destinação da Hospedagem não pode ter mais que 32 caracteres")
	private String descricao;
	
	@NotNull(message="Quantidade de Camas precisa ser informada")
	@Min(value=1, message="Quantidade de Leitos deve ser no mínimo 1" )
	@Max(value=2, message="Quantidade de Leitos deve ser no máximo 2" )
	private Integer quantidadeCamas;
}
