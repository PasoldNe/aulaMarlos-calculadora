package com.senai.calculadora.dtos;

public class SaidaConversorDto {

    private Double valor;
    private String conversao;
    private Double resultado;

    public SaidaConversorDto() {
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

    public Double getResultado() {
        return resultado;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }
}
