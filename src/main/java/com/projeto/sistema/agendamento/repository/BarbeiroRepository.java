package com.projeto.sistema.agendamento.repository;

import com.projeto.sistema.agendamento.model.entity.BarbeiroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BarbeiroRepository extends JpaRepository<BarbeiroEntity, Integer>  {
}
