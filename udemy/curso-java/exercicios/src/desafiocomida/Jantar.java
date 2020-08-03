package desafiocomida;

public class Jantar {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Pedro", 90.2);
		Comida c1 = new Comida("Frango", 0.800);
	
		
		//System.out.print(p1.nome);
		System.out.println("\nNome : "+ p1.nome + " / Peso Antigo : "+ p1.peso);
		System.out.printf("\n%s Comeu :  %.3f De %s\n ",p1.nome, c1.pesoComida ,c1.nome);
		p1.comer(c1);
		System.out.println("\nPeso Atual = " + p1.peso);
	}
}
