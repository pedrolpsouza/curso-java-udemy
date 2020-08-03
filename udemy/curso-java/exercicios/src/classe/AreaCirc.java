package classe;

public class AreaCirc {
	double raio;
	final static double PI = Math.PI;

	AreaCirc(double raioInicial) {
		//pi = 3.14;
		raio = raioInicial;
	}

	double area() {

		return PI * Math.pow(raio, 2); // return raio*raio*pi; - outra forma
	}
	double area(double raio1) {
		return PI * Math.pow(raio1, 2);
	}
}
