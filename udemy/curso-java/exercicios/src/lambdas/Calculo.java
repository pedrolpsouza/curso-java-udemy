package lambdas;

@FunctionalInterface // A INTERFACE PRECISA NECESS�RIAMENTE TER APENAS UM METODO CASO CONTR�RIO, A
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