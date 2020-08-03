package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Pedro", "Natalia", "Joaquim");
		System.out.println("for normal\n----------------------");
		for (int i = 0; i < aprovados.size(); i++) {
			System.out.println(aprovados.get(i));
		}
		System.out.println("usando foreach\n-------------");
		for (String nome : aprovados) {
			System.out.println(nome);
		}
		System.out.println("\nusando iterator\n----------");
		Iterator<String> it = aprovados.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("\nStream\n------------");
		Stream<String> st = aprovados.stream();
		st.forEach(System.out::println);
	}
}
