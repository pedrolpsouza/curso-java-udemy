package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	public static void main(String[] args) {

		Function<Produto, Double> precoFinal = p -> p.preco * (1 - p.desconto);
		UnaryOperator<Double> impostoMunicipal = v -> v >= 2500 ? v * 1.085 : v;
		UnaryOperator<Double> frete = f -> f >= 3000 ? f + 100 : f + 50;
		//UnaryOperator<Double> arredonda = x -> Double.parseDouble(String.format("%.2f", x));
		Function<Double, String> formata = f -> ("R$" + f).replace(".", ",");
		
		Produto prod = new Produto("Samsung A70", 2700.00, 0.00);
		String preco1 = precoFinal
				.andThen(impostoMunicipal)
				.andThen(frete)
				//.andThen(arredonda)
				.andThen(formata)
				.apply(prod);
		System.out.println(preco1);
	}
}
