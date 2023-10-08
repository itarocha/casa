package br.com.itarocha.casa.adapter.out.persistence.jpa.repository;

import br.com.itarocha.casa.adapter.out.persistence.jpa.entity.RoleEntity;
import br.com.itarocha.casa.core.domain.enums.RoleNameEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleJpaRepository extends JpaRepository<RoleEntity, Long> {

	Optional<RoleEntity> findByName(RoleNameEnum roleName);
	
}