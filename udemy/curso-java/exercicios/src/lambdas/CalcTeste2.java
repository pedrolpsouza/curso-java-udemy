package lambdas;

public class CalcTeste2 {
	public static void main(String[] args) {
		Calculo calc = (x, y) -> {return x + y;};
		Calculo multi = (x, y) ->{return x * y;};
		System.out.println(calc.executar(10, 20));
		System.out.println(multi.executar(5, 4));
		calc = (x, y) ->  x/y ; // return implicito
		System.out.println(calc.executar(6, 2));
		calc = (x, y) ->  x-y ;
		System.out.println(calc.executar(6, 2));
		System.out.println(calc.legal());
		System.out.println(Calculo.top());
		
	}
}
