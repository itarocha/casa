package br.com.itarocha.casa.adapter.out.persistence.jpa.mapper;

import br.com.itarocha.casa.adapter.out.persistence.jpa.entity.DestinacaoHospedagemEntity;
import br.com.itarocha.casa.core.domain.DestinacaoHospedagem;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DestinacaoHospedagemMapper {

    DestinacaoHospedagemMapper INSTANCE = Mappers.getMapper(DestinacaoHospedagemMapper.class);

    DestinacaoHospedagem toModel(DestinacaoHospedagemEntity model);
    DestinacaoHospedagemEntity toEntity(DestinacaoHospedagem model);

}
