package br.com.itarocha.casa.adapter.out.persistence.jpa.entity;

import br.com.itarocha.casa.adapter.out.persistence.audit.UserDateAudit;
import br.com.itarocha.casa.core.domain.enums.LogicoEnum;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="quarto")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class QuartoEntity extends UserDateAudit implements Serializable {

	private static final long serialVersionUID = -6172158858365759661L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message="Número precisa ser informado")
	private Integer numero;
	
	@NotNull(message="Descrição é obrigatória")
	@Size(max = 255, message="Descrição não pode ter mais que 255 caracteres")
	private String descricao;

	/*
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="destinacao_hospedagem_id")
	@NotNull(message="Destinação da Hospedagem é obrigatória")
	private DestinacaoHospedagem destinacaoHospedagem;
	*/
	
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "quarto_destinacoes",
            joinColumns = @JoinColumn(name = "quarto_id"),
            inverseJoinColumns = @JoinColumn(name = "destinacao_hospedagem_id"))
	@Builder.Default
    private Set<DestinacaoHospedagemEntity> destinacoes = new HashSet<>();
	
	@OneToMany(mappedBy = "quarto", fetch=FetchType.EAGER)
	@OrderBy("numero ASC")
	@Builder.Default
	private List<LeitoEntity> leitos = new ArrayList<>();

	@Builder.Default
	@Enumerated(EnumType.STRING)
	@Column(length = 1)
	private LogicoEnum ativo = LogicoEnum.S;

	@Transient
	private String displayText;

	@Transient
	public String getDisplayText() {
		return "Quarto " + ((this.numero != null) ? this.numero.toString() : "???");
	}
}
