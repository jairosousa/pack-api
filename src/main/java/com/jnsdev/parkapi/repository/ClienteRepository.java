package com.jnsdev.parkapi.repository;

import com.jnsdev.parkapi.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Autor Jairo Nascimento
 * @Created 02/09/2023 - 17:11
 */
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
