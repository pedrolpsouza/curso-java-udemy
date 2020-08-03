package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		// o java vai inferir pelo tipo da variavel e atribuir o tipo
		var b = 4.5;
		System.out.println(b);
		var c = "Pedro Topzera";
		System.out.println(c);
		c = "LOL";
		System.out.println("ALo");
		// não é possivel mudar o tipo de uma variavel inferida
		//exemplo
		//c = 22;
		System.out.println(c);
		var f = 12.0;
		f = 13.55;
		System.out.println(f);
	}
}
