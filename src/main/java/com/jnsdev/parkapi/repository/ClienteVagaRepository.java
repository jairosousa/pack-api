package com.jnsdev.parkapi.repository;

import com.jnsdev.parkapi.entity.ClienteVaga;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @Autor Jairo Nascimento
 * @Created 04/09/2023 - 19:50
 */
public interface ClienteVagaRepository extends JpaRepository<ClienteVaga, Long> {
    Optional<ClienteVaga> findByReciboAndDataSaidaIsNull(String recibo);
}
