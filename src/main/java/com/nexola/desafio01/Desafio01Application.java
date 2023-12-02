package com.nexola.desafio01;

import com.nexola.desafio01.entities.Pedido;
import com.nexola.desafio01.services.ValorTotal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Desafio01Application implements CommandLineRunner {

	@Autowired
	private ValorTotal valorTotal;

	public static void main(String[] args) {
		SpringApplication.run(Desafio01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Pedido pedido1 = new Pedido(1034, 150.0, 20.0);
		Pedido pedido2 = new Pedido(2282, 800.0, 10.0);
		Pedido pedido3 = new Pedido(1309, 95.90, 0.0);
		System.out.println(valorTotal.calculoValorTotal(pedido1));
		System.out.println(valorTotal.calculoValorTotal(pedido2));
		System.out.println(valorTotal.calculoValorTotal(pedido3));
	}
}
