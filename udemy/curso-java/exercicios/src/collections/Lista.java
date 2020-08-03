package collections;

import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();
		Usuario u1 = new Usuario("Pedro Souza");
		lista.add(u1);	
		lista.add(new Usuario("Joao Victor"));
		lista.add(new Usuario("Carla Victor"));
		lista.add(new Usuario("Joao  Lala"));
		lista.add(new Usuario("Luis HP"));
		lista.add(new Usuario("Natalia Bordin"));
		
		lista.remove(2);
		lista.remove(new Usuario("Luis HP"));
		for(Usuario teste: lista) {
			System.out.println(teste);
		}
	
	}
}
