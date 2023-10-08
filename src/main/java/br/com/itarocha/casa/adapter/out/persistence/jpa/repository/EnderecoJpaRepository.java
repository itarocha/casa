package br.com.itarocha.casa.adapter.out.persistence.jpa.repository;

import br.com.itarocha.casa.adapter.out.persistence.jpa.entity.EnderecoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoJpaRepository extends JpaRepository<EnderecoEntity, Long> {

}
