package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		// add e offer adicionam elementos na lista
		// a diferen�a � quando o comportamento quando a fila est� cheia

		fila.add("Jos�");
		fila.offer("Pedro");
		fila.add("Carlos");
		fila.offer("Ana");
		fila.add("Claudia");
		fila.offer("Natalia");
		System.out.println(fila.peek());// ele l� o primeiro elemento da fila mas nao remove o elemento, retorna null se
										// a fila estiver
		// vazia

		System.out.println(fila.element());// segue o mesmo procedimento do peek, lan�a uma exce��o se a fila tiver
											// vazia

		System.out.println(fila);
		// outros metodos para fila
		// fila.size(); retorna o tamanho
		// fila.clear(); para limpar a fila
		// fila.isEmpty() verifica se est� vazia
		//fila.pool(); obtem o proximo elemento da fila e remove
		
		
		
		
		
		
		
	}
}
