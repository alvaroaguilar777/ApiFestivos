package com.example.festivosapi.controller;

import com.example.festivosapi.model.Festivo;
import com.example.festivosapi.service.FestivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/festivos")
public class FestivoController {
    @Autowired
    private FestivoService festivoService;

    @GetMapping("/isFestivo")
    public boolean isFestivo(@RequestParam int dia, @RequestParam int mes) {
        return festivoService.isFestivo(dia, mes);
    }

    @GetMapping("/festivosPorAno")
    public List<Festivo> getFestivosByYear(@RequestParam int year) {
        return festivoService.getFestivosByYear(year);
    }
}
