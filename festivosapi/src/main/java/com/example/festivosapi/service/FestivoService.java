package com.example.festivosapi.service;

import com.example.festivosapi.model.Festivo;
import com.example.festivosapi.repository.FestivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FestivoService {
    @Autowired
    private FestivoRepository festivoRepository;

    public List<Festivo> getAllFestivos() {
        return festivoRepository.findAll();
    }

    public boolean isFestivo(int dia, int mes) {
        return !festivoRepository.findByDiaAndMes(dia, mes).isEmpty();
    }

    public List<Festivo> getFestivosByYear(int year) {
        return festivoRepository.findByTipoId(year);
    }
}
