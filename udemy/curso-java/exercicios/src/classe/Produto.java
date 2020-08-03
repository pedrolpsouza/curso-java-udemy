package classe;

public class Produto {

	String nome;
	double preco;
	static double desconto = 0.25;

	Produto() {

	}

	Produto(String nomei, double precoi) {
		nome = nomei;
		preco = precoi;
	}

	int soma(int a, int b) {

		return a + b;
	}

	double precoComDesconto() {

		return preco * (1 - desconto);
	}

	double precoComAcrescimo() {
		return (preco * desconto) + preco;
	}
}
