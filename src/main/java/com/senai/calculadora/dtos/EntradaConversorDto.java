package com.senai.calculadora.dtos;

public class EntradaConversorDto {

    private Double valor;
    private String conversao;

    public EntradaConversorDto() {
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getConversao() {
        return conversao;
    }

    public void setConversao(String conversao) {
        this.conversao = conversao;
    }
}
