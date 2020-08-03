package collections;

import java.util.ArrayDeque;
import java.util.Deque;



public class Pilha {
	public static void main(String[] args) {
		//L.I.F.O
		Deque<String> livros = new ArrayDeque<>();
		
		
		livros.push("Harry potter");
		livros.push("Java para leigos");
		livros.push("Aprendendo programação orientada a objetos");
		
		//vai aparecer sempre o ultimo elemento da pilha 
		System.out.println(livros.peek());
		System.out.println(livros.element());
		System.out.println(livros.poll());
		System.out.println(livros.peek());
		// meodos tambem disponiveis pra pilha
		//livros.contains();
		////livros.size();
		// livros.clear();
		//livros.isEmpty();
		/*
		for(String a: livros) {
			System.out.println(a);
		}
		*/
		
	}
}
