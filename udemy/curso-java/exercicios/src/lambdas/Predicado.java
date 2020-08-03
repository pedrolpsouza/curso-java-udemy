package lambdas;

import java.util.function.Predicate;

public class Predicado {
	public static void main(String[] args) {
		// Predicate retorna um valor booleano
		Predicate<Produto> isCaro = x ->  x.preco > 5000.00;
		Produto p1 = new Produto("notebook", 3500.89, .15);
		System.out.println(isCaro.test(p1));
	}
}
