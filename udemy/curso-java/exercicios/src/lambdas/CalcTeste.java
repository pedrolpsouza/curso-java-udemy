package lambdas;

public class CalcTeste {
	public static void main(String[] args) {
		Calculo a = new Soma();
		//Multiplicar b = new Multiplicar();
		System.out.println(a.executar(1, 2));
		//System.out.println(b.executar(3, 3));
		a = new Multiplicar();
		System.out.println(a.executar(3, 4));
		
	}
}
