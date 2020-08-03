package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap<>();
		usuarios.put(1, "Pedro");
		usuarios.put(50, "Joao");
		usuarios.put(3, "Carlos");
		usuarios.put(42, "Ana");
		usuarios.put(5, "natalia");
		/*
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		System.out.println(usuarios.containsKey(8));
		System.out.println(usuarios.containsValue("Pedro"));
		System.out.println(usuarios.containsValue("Joaquina"));
		System.out.println(usuarios.get(42));
		*/
		/*
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		*/
		/*
		for(String chave: usuarios.values()) {
			System.out.println(chave);
		}
		*/
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey());
			System.out.println(" " + registro.getValue());
		}
	}
}
