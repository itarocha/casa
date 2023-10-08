package br.com.itarocha.casa.adapter.out.persistence.jpa.entity;

import br.com.itarocha.casa.adapter.out.persistence.audit.UserDateAudit;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name="destinacao_hospedagem")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DestinacaoHospedagemEntity extends UserDateAudit implements Serializable {

	private static final long serialVersionUID = 397874357784755819L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message="Descrição é obrigatória")
	@Size(min = 3, max = 32, message="Descrição deve ter entre 3 e 32 caracteres")
	private String descricao;
}
