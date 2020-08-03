package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		// add e offer adicionam elementos na lista
		// a diferença é quando o comportamento quando a fila está cheia

		fila.add("José");
		fila.offer("Pedro");
		fila.add("Carlos");
		fila.offer("Ana");
		fila.add("Claudia");
		fila.offer("Natalia");
		System.out.println(fila.peek());// ele lé o primeiro elemento da fila mas nao remove o elemento, retorna null se
										// a fila estiver
		// vazia

		System.out.println(fila.element());// segue o mesmo procedimento do peek, lança uma exceção se a fila tiver
											// vazia

		System.out.println(fila);
		// outros metodos para fila
		// fila.size(); retorna o tamanho
		// fila.clear(); para limpar a fila
		// fila.isEmpty() verifica se está vazia
		//fila.pool(); obtem o proximo elemento da fila e remove
		
		
		
		
		
		
		
	}
}
