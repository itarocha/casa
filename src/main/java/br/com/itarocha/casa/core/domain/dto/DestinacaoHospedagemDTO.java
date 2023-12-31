package br.com.itarocha.casa.core.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DestinacaoHospedagemDTO {
    private Long id;

    @NotNull(message="Descrição é obrigatória")
    @Size(min = 3, max = 32, message="Descrição deve ter entre 3 e 32 caracteres")
    private String descricao;
}
