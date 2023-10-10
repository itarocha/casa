package br.com.itarocha.casa.core.ports.in;


import br.com.itarocha.casa.core.domain.DestinacaoHospedagem;
import br.com.itarocha.casa.core.domain.SelectValueVO;

import java.util.List;
import java.util.Optional;

public interface DestinacaoHospedagemUseCase {

	DestinacaoHospedagem create(DestinacaoHospedagem model);

	//void remove(Long id);

	Optional<DestinacaoHospedagem> find(Long id);

	List<DestinacaoHospedagem> findAll();

	//List<SelectValueVO> listSelect();

}
