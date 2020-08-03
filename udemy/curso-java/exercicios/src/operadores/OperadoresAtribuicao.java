package operadores;

public class OperadoresAtribuicao {
	public static void main(String[] args) {
		int a = 3;
		int b = a;
		int c = a + b;
		System.out.println(c);
		c += b;
		System.out.println(c);
		c-=(a-b);
		System.out.println(c);
	}
}
