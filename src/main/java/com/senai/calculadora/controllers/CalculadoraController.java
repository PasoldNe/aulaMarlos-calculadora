package com.senai.calculadora.controllers;

import com.senai.calculadora.dtos.*;
import com.senai.calculadora.services.CalculadoraService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

    private final CalculadoraService service;

    public CalculadoraController(CalculadoraService service) {
        this.service = service;
    }

    // -- http://localhost:8080/calculadora
    @PostMapping
    public ResponseEntity<SaidaOperacaoDto> calcular(@RequestBody EntradaOperacaoDto entrada) {
        SaidaOperacaoDto saida = service.calcular(entrada);
        return ResponseEntity.ok().body(saida);
    }

    // -- http://localhost:8080/calculadora/adicionar
    @PostMapping("/adicionar")
    public ResponseEntity<SaidaDto> adicionar(@RequestBody EntradaDto entrada) {
        SaidaDto saida = service.adicionar(entrada);
        return ResponseEntity.ok().body(saida);
    }

    // -- http://localhost:8080/calculadora/subtrair
    @PostMapping("/subtrair")
    public ResponseEntity<SaidaDto> subtrair(@RequestBody EntradaDto entrada) {
        SaidaDto saida = service.subtrair(entrada);
        return ResponseEntity.ok().body(saida);
    }

    // -- http://localhost:8080/calculadora/multiplicar
    @PostMapping("/multiplicar")
    public ResponseEntity<SaidaDto> multiplicar(@RequestBody EntradaDto entrada) {
        SaidaDto saida = service.multiplicar(entrada);
        return ResponseEntity.ok().body(saida);
    }

    // -- http://localhost:8080/calculadora/dividir
    @PostMapping("/dividir")
    public ResponseEntity<SaidaDto> dividir(@RequestBody EntradaDto entrada) {
        SaidaDto saida = service.dividir(entrada);
        return ResponseEntity.ok().body(saida);
    }
}