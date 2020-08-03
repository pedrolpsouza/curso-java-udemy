package poo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	final String nome;
	
	final List<Compra> compras = new ArrayList<Compra>();

	Cliente(String nome) {
		this.nome = nome;
	}

	double valorTotal() {

		double total = 0;
		for (Compra compras : compras) {
			total += compras.valorTotal();
		}
		return total;
	}
}
