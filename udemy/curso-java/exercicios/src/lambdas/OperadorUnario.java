package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {
	public static void main(String[] args) {
		UnaryOperator<Integer> mais2 = n -> n + 2;
		UnaryOperator<Integer> x2 = n -> n * 2;
		UnaryOperator<Integer> quadrado = n -> n*n;
		int resultado1 = mais2.andThen(x2).andThen(quadrado).apply(2);
		System.out.println(resultado1);
		int resultado2 = quadrado.compose(x2).compose(mais2).apply(2); //executa de trás pra frente
		System.out.println(resultado2);
	}
}