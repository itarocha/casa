package br.com.itarocha.casa.adapter.out.persistence.jpa.entity;

import br.com.itarocha.casa.adapter.out.persistence.audit.UserDateAudit;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name="tipo_hospede")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TipoHospedeEntity extends UserDateAudit implements Serializable{

	private static final long serialVersionUID = 3527441284759034033L;

	/*
	PACIENTE("Paciente"),
	ACOMPANHANTE("Acompanhante");	
	*/

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message="Descrição é obrigatória")
	@Size(max = 32, message="Descrição do Tipo de Hóspede não pode ter mais que 32 caracteres")
	private String descricao;
}
