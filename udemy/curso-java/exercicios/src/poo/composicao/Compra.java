package poo.composicao;

import java.util.ArrayList;

public class Compra {

	String nomeCliente;
	ArrayList<Item> itens = new ArrayList<Item>();

	double valorTotal() {
		double total = 0;
		
		for (Item itemVariavel : itens) {
			total += itemVariavel.quantidade * itemVariavel.preco;
		}
		return total;
	}
}
