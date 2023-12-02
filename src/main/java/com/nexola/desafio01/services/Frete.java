package com.nexola.desafio01.services;

import org.springframework.stereotype.Service;

@Service
public class Frete {

    public double calculoFrete(double valor) {
        if (valor < 100) {
            return valor + 20;
        } else if (valor >= 100 && valor < 200) {
            return valor + 12;
        } else {
            return valor;
        }
    }
}
