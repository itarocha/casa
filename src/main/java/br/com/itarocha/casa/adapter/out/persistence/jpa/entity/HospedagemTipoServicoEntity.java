package br.com.itarocha.casa.adapter.out.persistence.jpa.entity;

import br.com.itarocha.casa.adapter.out.persistence.audit.UserDateAudit;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name="hospedagem_tipo_servico")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HospedagemTipoServicoEntity extends UserDateAudit implements Serializable {
	
	private static final long serialVersionUID = 4121535384605572478L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="hospedagem_id")
	@NotNull(message="Hospedagem precisa ser informado")
	private HospedagemEntity hospedagem;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="tipo_servico_id")
	@NotNull(message="Tipo de Serviço precisa ser informado")
	private TipoServicoEntity tipoServico;
}
