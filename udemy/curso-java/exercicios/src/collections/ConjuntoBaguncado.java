package collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		/* */
		HashSet conjunto = new HashSet ();
		conjunto.add(1.2);
		conjunto.add(false);
		conjunto.add("TESTE");
		conjunto.add(5);
		conjunto.add('a');	
		System.out.println(" Tamanho " + conjunto.size());
		conjunto.add("Teste");
		System.out.println(" Tamanho " + conjunto.size());
		System.out.println(conjunto.remove("Teste"));
		System.out.println(" Tamanho " + conjunto.size());
		System.out.println(conjunto.contains(false));
		
		Set numeros = new HashSet();
		numeros.add(5);numeros.add(2);numeros.add(3);numeros.add(4);
		
		//System.out.println(numeros);
		//conjunto.addAll(numeros);
		//System.out.println(conjunto);
		conjunto.retainAll(numeros); // interseção
		conjunto.clear();
		System.out.println(conjunto);
		
	}
}
