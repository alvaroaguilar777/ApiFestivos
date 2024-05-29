package com.example.festivosapi.repository;

import com.example.festivosapi.model.Festivo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FestivoRepository extends JpaRepository<Festivo, Integer> {
    List<Festivo> findByDiaAndMes(int dia, int mes);

    List<Festivo> findByTipoId(int tipoId);
}
