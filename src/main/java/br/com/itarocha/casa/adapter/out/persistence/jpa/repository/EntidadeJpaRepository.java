package br.com.itarocha.casa.adapter.out.persistence.jpa.repository;

import br.com.itarocha.casa.adapter.out.persistence.jpa.entity.EntidadeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntidadeJpaRepository extends JpaRepository<EntidadeEntity, Long> {

}
