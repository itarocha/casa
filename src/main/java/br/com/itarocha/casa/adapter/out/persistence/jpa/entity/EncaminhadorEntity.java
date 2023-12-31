package br.com.itarocha.casa.adapter.out.persistence.jpa.entity;

import br.com.itarocha.casa.adapter.out.persistence.audit.UserDateAudit;
import br.com.itarocha.casa.core.domain.enums.LogicoEnum;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name="encaminhador")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EncaminhadorEntity extends UserDateAudit implements Serializable{
	
	private static final long serialVersionUID = 4127725617611839075L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="entidade_id")
	@NotNull(message="Entidade é obrigatória")
	private EntidadeEntity entidade;
	
	@NotNull(message="Nome é obrigatório")
	@Size(min = 2, max = 64, message="Nome deve ter entre 2 a 64 caracteres")
	private String nome;
	
	@NotNull(message="Cargo é obrigatório")
	@Size(min = 2, max = 64, message="Cargo deve ter entre 2 a 64 caracteres")
	private String cargo;

	@NotNull(message="Telefone é obrigatório")
	@Size(max = 16, message="Telefone não pode ter mais que 16 caracteres")
	private String telefone;
	
	@javax.validation.constraints.Email(message="Email inválido")
	@Size(max = 64, message="Email deve ter no máximo 64 caracteres")
	private String email;
	
	@Enumerated(EnumType.STRING)
	@Column(length=1)
	@NotNull(message="Ativo é obrigatório")
	@Builder.Default
	private LogicoEnum ativo = LogicoEnum.S;
}
