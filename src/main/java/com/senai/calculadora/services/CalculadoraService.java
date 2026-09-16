package com.senai.calculadora.services;

import org.springframework.stereotype.Service;
import com.senai.calculadora.dtos.*;

@Service
public class CalculadoraService {

    public SaidaOperacaoDto calcular(EntradaOperacaoDto entrada) {

        String operacao = entrada.getOperacao();
        Double resultado = 0D;

        Double num1 = entrada.getNumero1();
        Double num2 = entrada.getNumero2();

        switch (operacao) {
            case "+":
                resultado = adicionar(num1, num2);
                break;
            case "-":
                resultado = subtrai(num1, num2);
                break;
            case "*":
                resultado = multiplica(num1, num2);
                break;
            case "/":
                resultado = divide(num1, num2);
                break;
            case "^":
                resultado = potencia(num1, num2);
                break;
            case "%":
                resultado = modulo(num1, num2);
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }

        SaidaOperacaoDto saida = new SaidaOperacaoDto();
        saida.setNumero1(num1);
        saida.setNumero2(num2);
        saida.setOperacao(operacao);
        saida.setResultado(resultado);

        return saida;
    }

    public SaidaDto adicionar(EntradaDto entrada) {
        SaidaDto saida = new SaidaDto();
        saida.setNumero1(entrada.getNumero1());
        saida.setNumero2(entrada.getNumero2());
        saida.setResultado(adicionar(entrada.getNumero1(), entrada.getNumero2()));
        return saida;
    }

    public SaidaDto subtrair(EntradaDto entrada) {
        SaidaDto saida = new SaidaDto();
        saida.setNumero1(entrada.getNumero1());
        saida.setNumero2(entrada.getNumero2());
        saida.setResultado(subtrai(entrada.getNumero1(), entrada.getNumero2()));
        return saida;
    }

    public SaidaDto multiplicar(EntradaDto entrada) {
        SaidaDto saida = new SaidaDto();
        saida.setNumero1(entrada.getNumero1());
        saida.setNumero2(entrada.getNumero2());
        saida.setResultado(multiplica(entrada.getNumero1(), entrada.getNumero2()));
        return saida;
    }

    public SaidaDto dividir(EntradaDto entrada) {
        SaidaDto saida = new SaidaDto();
        saida.setNumero1(entrada.getNumero1());
        saida.setNumero2(entrada.getNumero2());
        saida.setResultado(divide(entrada.getNumero1(), entrada.getNumero2()));
        return saida;
    }

    private Double adicionar(Double numero1, Double numero2) {
        return numero1 + numero2;
    }

    private Double subtrai(Double numero1, Double numero2) {
        return numero1 - numero2;
    }

    private Double multiplica(Double numero1, Double numero2) {
        return numero1 * numero2;
    }

    private Double divide(Double numero1, Double numero2) {
        if (numero2 == 0) {
            return 0D;
        }
        return numero1 / numero2;
    }

    private Double potencia(Double numero1, Double numero2) {
        return Math.pow(numero1, numero2);
    }

    private Double modulo(Double numero1, Double numero2) {
        if (numero2 == 0) {
            return 0D;
        }
        return numero1 % numero2;
    }
}