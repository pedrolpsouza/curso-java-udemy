package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {
	public static void main(String[] args) {
		Predicate<Integer> isPar = n -> n % 2 == 0;
		Predicate<Integer> is3Digitos = n -> n >= 100 && n <= 999;
		//System.out.println(isPar.test(5));
		System.out.println(isPar.or(is3Digitos).test(333));
	}
}
