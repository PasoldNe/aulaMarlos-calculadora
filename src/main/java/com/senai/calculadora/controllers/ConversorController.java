package com.senai.calculadora.controllers;

import com.senai.calculadora.dtos.EntradaConversorDto;
import com.senai.calculadora.dtos.SaidaConversorDto;
import com.senai.calculadora.dtos.SaidaOperacaoDto;
import com.senai.calculadora.services.CalculadoraService;
import com.senai.calculadora.services.ConversorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/conversor")

public class ConversorController {

    private final ConversorService service;

    public ConversorController(ConversorService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<SaidaConversorDto> conversor(@RequestBody EntradaConversorDto entrada){
        SaidaConversorDto saida = service.calculo(entrada);
        return ResponseEntity.ok().body(saida);
    }
}
