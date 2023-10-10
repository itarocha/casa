package br.com.itarocha.casa.core.service;

import br.com.itarocha.casa.adapter.out.persistence.jpa.repository.DestinacaoHospedagemJpaRepository;
import br.com.itarocha.casa.core.domain.DestinacaoHospedagem;
import br.com.itarocha.casa.core.ports.in.DestinacaoHospedagemUseCase;
import br.com.itarocha.casa.core.ports.out.DestinacaoHospedagemPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DestinacaoHospedagemService implements DestinacaoHospedagemUseCase {

	private final DestinacaoHospedagemPort repository;

	public DestinacaoHospedagem create(DestinacaoHospedagem model) {
		try{
			return repository.create(model);
		} catch(Exception e){
			throw new IllegalArgumentException(e.getMessage());
		}
	}

	/*
	public void remove(Long id) {
		repository.findById(id).ifPresent(repository::delete);
	}
	*/
	public Optional<DestinacaoHospedagem> find(Long id) {
		return repository.findById(id);
	}

	public List<DestinacaoHospedagem> findAll() {
		return repository.findAll();
	}

	/*
	public List<SelectValueVO> listSelect() {
		return repository.findAllToSelectVO();
	}
	*/
}
