package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		//double a = 2.9;
		String s = " Pedro Souza X ";
		//System.out.println("Nome = Pedro Souza " + " Idade = " + 2.9);
		//s.toUpperCase();
		//System.out.println(s.toUpperCase());
		// ou
		//System.out.println(s);
		s = s.replace(" Souza ", " Olá Jow ");
		s = s.toUpperCase();
		s = s.concat("Ae porra !!!!!!");
		System.out.println(s);
		String alfa = "EITA PORRA.";
		System.out.println(alfa.toLowerCase().concat("Quero café"));
	}
}
	