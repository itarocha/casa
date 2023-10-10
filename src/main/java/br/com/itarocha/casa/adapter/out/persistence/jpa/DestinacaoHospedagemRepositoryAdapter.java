package br.com.itarocha.casa.adapter.out.persistence.jpa;

import br.com.itarocha.casa.adapter.out.persistence.jpa.entity.DestinacaoHospedagemEntity;
import br.com.itarocha.casa.adapter.out.persistence.jpa.mapper.DestinacaoHospedagemMapper;
import br.com.itarocha.casa.adapter.out.persistence.jpa.repository.DestinacaoHospedagemJpaRepository;
import br.com.itarocha.casa.core.domain.DestinacaoHospedagem;
import br.com.itarocha.casa.core.ports.out.DestinacaoHospedagemPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static br.com.itarocha.casa.adapter.out.persistence.jpa.mapper.DestinacaoHospedagemMapper.*;

@Service
@RequiredArgsConstructor
public class DestinacaoHospedagemRepositoryAdapter implements DestinacaoHospedagemPort {

    private final DestinacaoHospedagemJpaRepository repository;
    private final DestinacaoHospedagemMapper mapper = INSTANCE;

    @Override
    public List<DestinacaoHospedagem> findAll() {
        return repository.findAllOrderByDescricao()
                .stream()
                .map(mapper::toModel)
                .collect(Collectors.toList());
    }

    /*
    private final DestinacaoHospedagemJpaRepository repository;
    private final DestinacaoHospedagemMapper mapper;

    */
    @Override
    public DestinacaoHospedagem create(DestinacaoHospedagem model) {
        return mapper.toModel(repository.save(mapper.toEntity(model)));
    }

    @Override
    public Optional<DestinacaoHospedagem> findById(Long id) {
        Optional<DestinacaoHospedagemEntity> opt = repository.findById(id);
        return opt.map(mapper::toModel);
    }
    /*
    @Override
    public void delete(DestinacaoHospedagem model) {
        repository.delete(mapper.toEntity(model));
    }

    @Override
    public List<DestinacaoHospedagem> findAllOrderByDescricao() {
        return repository.findAllOrderByDescricao()
                .stream()
                .map(mapper::toModel)
                .collect(Collectors.toList());
    }

    @Override
    public List<SelectValueVO> findAllToSelectVO() {
        return repository.findAllOrderByDescricao()
                .stream()
                .map(mapper::toModel)
                .map(mapper::toSelectValueVO)
                .collect(Collectors.toList());
    }
     */
}
