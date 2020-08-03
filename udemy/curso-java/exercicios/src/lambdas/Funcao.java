package lambdas;

import java.util.function.Function;

public class Funcao {
	public static void main(String[] args) {
		Function<Integer, String> parOuImpar = n -> n %  2 == 0 ? "Par" : "impar";
		System.out.println(parOuImpar.apply(3));
		Function<String, String> resultado = valor -> "Resultado = " + valor;
		
		String resultadoFinal = parOuImpar.andThen(resultado).apply(3);
		System.out.println(resultadoFinal);
	}
}
