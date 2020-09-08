package com.example.test.repository;

import com.example.test.entity.Telefono;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TelefonoRepository extends JpaRepository<Telefono,Long> {
}
