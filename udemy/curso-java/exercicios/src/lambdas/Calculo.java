package lambdas;

@FunctionalInterface // A INTERFACE PRECISA NECESSÁRIAMENTE TER APENAS UM METODO CASO CONTRÁRIO, A
						// LAMBDA NAO FUNCIONA
public interface Calculo {

	double executar(double a, double b);

	default String legal() {
		return "legal";
	}

	static String top() {
		return "wow";
	}
}
