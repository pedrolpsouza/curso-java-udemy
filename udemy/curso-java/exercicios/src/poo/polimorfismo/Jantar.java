package poo.polimorfismo;

public class Jantar {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(88);
		Arroz ingrediente1 = new Arroz(.100);
		Feijao ingrediente2 = new Feijao(0.550);
		Sorvete sobremesa = new Sorvete(0.400);
		System.out.println(p1.getPeso());
		/*
		System.out.printf("Peso atual %.2f", p1.comer(ingrediente1));
		System.out.printf("\nPeso atual %.2f", p1.comer(ingrediente2));
		System.out.printf("\nPeso atual %.2f", p1.comer(sobremesa));
		*/
		p1.comer(ingrediente1);
		p1.comer(ingrediente2);
		p1.comer(sobremesa);
		System.out.printf("Peso atual %.2f " , p1.getPeso());
	}

}
