package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		//charAt mostra a letra no indice de acordo com o número
		System.out.println("Hello World".charAt(2));
		String s = "boa tarde";
		s = s.toUpperCase();
		System.out.println(s.concat(" Pedro "));
		System.out.println(s.startsWith("BOA"));
		System.out.println(s.endsWith("tarde"));
		System.out.println(s.endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.equals("BOA TARDE"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		var p = "Pedro";
		var so = "Souza";
		var idade = 29;
		var money = 1400.00;
		System.out.println(p + "\n" + so);
		//%s substitui strings e %d substitui valores inteiros e %f valores float/double
		System.out.printf("Nome : %s %s tem %d anos e ganha %.2f Reais", p, so, idade, money);
				
	}
}
	