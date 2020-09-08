package com.example.test.repository;

import com.example.test.entity.Telefono;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface TelefonoRepository extends JpaRepository<Telefono, Long> {

    @Query(value = "SELECT * FROM telefonos WHERE numero = :numero", nativeQuery = true)
    Telefono findTelefono(@Param("numero") String numero);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM telefonos WHERE numero = :numero", nativeQuery = true)
    void deleteTelefono(@Param("numero") String numero);
}
