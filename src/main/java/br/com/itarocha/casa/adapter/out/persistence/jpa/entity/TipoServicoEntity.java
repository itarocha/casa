package br.com.itarocha.casa.adapter.out.persistence.jpa.entity;

import br.com.itarocha.casa.adapter.out.persistence.audit.UserDateAudit;
import br.com.itarocha.casa.core.domain.enums.LogicoEnum;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name="tipo_servico")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TipoServicoEntity extends UserDateAudit implements Serializable {

	private static final long serialVersionUID = -7511416572575687871L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message="Descrição é obrigatória")
	@Size(min = 3, max = 32, message="Descrição deve ter entre 3 e 32 caracteres")
	private String descricao;

	@Builder.Default
	@Enumerated(EnumType.STRING)
	@Column(length=1)
	@NotNull(message="Ativo é obrigatório")
	private LogicoEnum ativo = LogicoEnum.S;
}
