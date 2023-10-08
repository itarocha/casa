package br.com.itarocha.casa.adapter.out.persistence.jpa.entity;

import br.com.itarocha.casa.adapter.out.persistence.audit.UserDateAudit;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name="leito")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LeitoEntity extends UserDateAudit implements Serializable {
	
	private static final long serialVersionUID = 5765750404479537331L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="quarto_id")
	@NotNull
	private QuartoEntity quarto;

	@NotNull(message="Número Sequencial precisa ser informada")
	@Min(value=1, message="Número deve ser no mínimo 1" )
	private Integer numero;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="tipo_leito_id")
	@NotNull(message="Tipo de Leito deve ser informado")
	private TipoLeitoEntity tipoLeito;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="situacao_leito_id")
	@NotNull(message="Situação do Leito deve ser informada")
	private SituacaoLeitoEntity situacao;
}
