package com.jnsdev.parkapi.repository;

import com.jnsdev.parkapi.entity.Vaga;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @Autor Jairo Nascimento
 * @Created 03/09/2023 - 16:58
 */
public interface VagaRepository extends JpaRepository<Vaga, Long> {
    Optional<Vaga> findByCodigo(String codigo);
}
