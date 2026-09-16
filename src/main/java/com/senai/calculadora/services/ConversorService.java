package com.senai.calculadora.services;

import com.senai.calculadora.dtos.EntradaConversorDto;
import com.senai.calculadora.dtos.SaidaConversorDto;
import org.springframework.stereotype.Service;


@Service
public class ConversorService {

    public SaidaConversorDto calculo(EntradaConversorDto entrada){
        SaidaConversorDto saida = new SaidaConversorDto();

        switch (entrada.getConversao()){
            case "C_F":
                saida.setResultado(celsiusfahrenheit(entrada));
                break;
            case "F_C":
                saida.setResultado(fahrenheitcelsius(entrada));
                break;
            case "KM_MI":
                saida.setResultado(quilometromilha(entrada));
                break;
            case "MI_KM":
                saida.setResultado(milhaquilometro(entrada));
                break;
            case "M_CM":
                saida.setResultado(metroscentimetros(entrada));
                break;
            case "CM_M":
                saida.setResultado(centimetrosmetros(entrada));
                break;
            default:
                break;
        }

        saida.setValor(entrada.getValor());
        saida.setConversao(entrada.getConversao());

        return saida;
    }

    private Double celsiusfahrenheit(EntradaConversorDto entrada){
        Double resultado = 0D;
        resultado = (entrada.getValor() * 9 / 5 ) + 32;
        return resultado;
    }
    private Double fahrenheitcelsius(EntradaConversorDto entrada){
        Double resultado = 0D;
        resultado = (entrada.getValor() - 32) * 5 / 9;
        return resultado;
    }
    private Double quilometromilha(EntradaConversorDto entrada){
        Double resultado = 0D;
        resultado = entrada.getValor() * 0.621371;
        return resultado;
    }

    private Double milhaquilometro(EntradaConversorDto entrada){
        Double resultado = 0D;
        resultado = entrada.getValor() * 1.60934;
        return resultado;
    }

    private Double metroscentimetros(EntradaConversorDto entrada){
        double resultado = 0D;
        resultado = entrada.getValor() * 100;
        return resultado;
    }

    private Double centimetrosmetros(EntradaConversorDto entrada){
        Double resultado = 0D;
        resultado = entrada.getValor() / 100;
        return resultado;
    }
}
