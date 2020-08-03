package collections;

import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {
	//@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		//Set <String> lista = new HashSet<String>(); // o HashSet será obrigatóriamente String
		Set <String> lista = new TreeSet<String>(); 
		lista.add("Pedro");
		//lista.add(1);
		lista.add("Adalberto");
		lista.add("Natalia");
		for(String candidato: lista) {
			System.out.println(candidato);
		}
		
		/*
		HashSet lista = new HashSet();
		lista.add(1);
		lista.add(2);
		System.out.println(lista);
		*/
	}
}
