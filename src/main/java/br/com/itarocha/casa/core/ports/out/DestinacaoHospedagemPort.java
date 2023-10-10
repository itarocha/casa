package br.com.itarocha.casa.core.ports.out;


import br.com.itarocha.casa.core.domain.DestinacaoHospedagem;

import java.util.List;
import java.util.Optional;

public interface DestinacaoHospedagemPort {

	DestinacaoHospedagem create(DestinacaoHospedagem model);

	//void remove(Long id);

	Optional<DestinacaoHospedagem> findById(Long id);

	List<DestinacaoHospedagem> findAll();

	//List<SelectValueVO> listSelect();

}
