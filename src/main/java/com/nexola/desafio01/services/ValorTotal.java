package com.nexola.desafio01.services;

import com.nexola.desafio01.entities.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ValorTotal {

    @Autowired
    private Frete frete;

    public double calculoValorTotal(Pedido pedido) {
        double valorTotal = pedido.getValorBasico() - pedido.getValorBasico() * (pedido.getDesconto() / 100);
        return frete.calculoFrete(valorTotal);
    }

}
